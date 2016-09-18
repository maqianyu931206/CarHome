package com.maqianyu.carhome.ui.fragment.article;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ListTypeBean;
import com.maqianyu.carhome.ui.Bean.RotateBean;
import com.maqianyu.carhome.ui.activity.ArticleNewInfoActivity;
import com.maqianyu.carhome.ui.adapter.ListTypeAdapter;
import com.maqianyu.carhome.ui.adapter.RotateArticleAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 推荐-新闻
 */
public class ArticleNewFragment extends AbsBaseFragment  implements  VolleyResult{
    private static final int TIME = 3000;
    private ViewPager viewPager;
    private LinearLayout pointLl;// 轮播状态改变的小圆点容器
    private List<RotateBean> datas;
    private RotateArticleAdapter vpAdapter;
    private ListTypeAdapter listTypeAdapter;
    private Handler handler;
    private boolean isRotate = false;
    private Runnable rotateRunnable;
    private  String url;
    private ListView listView;

    public static ArticleNewFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        ArticleNewFragment fragment = new ArticleNewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_article_new;
    }
    @Override
    protected void initViews() {
        viewPager =byView(R.id.rotate_vp);
        pointLl = byView(R.id.rotate_point_container);
        listView  =byView(R.id.artical_new_lv);
    }
    @Override
    protected void initData() {
        Bundle bundel = getArguments();
        url = bundel.getString("url");
        //获取网络数据
        VolleyInstance.getInstance().startRequest(url,this);
        listTypeAdapter = new ListTypeAdapter(context);
        listView.setAdapter(listTypeAdapter);

        buildDatas();//轮播图构造数据
        vpAdapter = new RotateArticleAdapter(datas,context);
        viewPager.setAdapter(vpAdapter);
        // ViewPager的页数为int最大值,设置当前页多一些,可以上来就向前滑动
        // 为了保证第一页始终为数据的第0条 取余要为0,因此设置数据集合大小的倍数
        viewPager.setCurrentItem(datas.size() * 100);
        // 开始轮播
        handler = new Handler();
        startRotate();
        // 添加轮播小点
        addPoints();
        // 随着轮播改变小点
        changePoints();
    }

    // 网络请求成功
    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        ListTypeBean listTypeBean = gson.fromJson(resultStr,ListTypeBean.class);
        List<ListTypeBean.ResultBean.NewslistBean> datas = listTypeBean.getResult().getNewslist();
        listTypeAdapter.setDatas(datas);
        // 跳转详情
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//               ListTypeBean.ResultBean.NewslistBean bean = (ListTypeBean.ResultBean.NewslistBean) parent.getItemAtPosition(position);
//                String title =bean.getTitle();
//                Intent intent  =new Intent(context, ArticleNewInfoActivity.class);
//                intent.putExtra("title",title);
//                intent.putExtra("id",bean.getId());
//                startActivity(intent);
//            }
//        });
    }

    // 失败
    @Override
    public void failure() {
    }
    private void changePoints() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                if (isRotate) {
                    // 把所有小点设置为白色
                    for (int i = 0; i < datas.size(); i++) {
                        ImageView pointIv = (ImageView) pointLl.getChildAt(i);
                        pointIv.setImageResource(R.mipmap.point_white);
                    }
                    // 设置当前位置小点为灰色
                    ImageView iv = (ImageView) pointLl.getChildAt(position % datas.size());
                    iv.setImageResource(R.mipmap.point_grey);
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
    private void addPoints() {
        // 有多少张图加载多少个小点
        for (int i = 0; i < datas.size(); i++) {
            ImageView pointIv = new ImageView(getContext());
            pointIv.setPadding(5,5,5,5);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(45,45);
            pointIv.setLayoutParams(params);
            // 设置第0页小点的为灰色
            if (i == 0) {
                pointIv.setImageResource(R.mipmap.point_grey);
            } else {
                pointIv.setImageResource(R.mipmap.point_white);
            }
            pointLl.addView(pointIv);
        }
    }
    private void startRotate() {
        rotateRunnable = new Runnable() {
            @Override
            public void run() {
                int nowIndex = viewPager.getCurrentItem();
                viewPager.setCurrentItem(++nowIndex);
                if (isRotate) {
                    handler.postDelayed(rotateRunnable, TIME);
                }
            }
        };
        handler.postDelayed(rotateRunnable, TIME);
    }
    @Override
    public void onResume() {
        super.onResume();
        isRotate = true;
    }
    @Override
    public void onPause() {
        super.onPause();
        isRotate = false;
    }
    private void buildDatas() {
        datas = new ArrayList<>();
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_NEW_1));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_NEW_2));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_NEW_3));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_NEW_4));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_NEW_5));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_NEW_6));
    }

}