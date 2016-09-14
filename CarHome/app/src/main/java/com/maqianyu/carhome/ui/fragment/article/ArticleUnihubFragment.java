package com.maqianyu.carhome.ui.fragment.article;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleUnihubBean;
import com.maqianyu.carhome.ui.Bean.RotateBean;
import com.maqianyu.carhome.ui.adapter.ArticleUnihubAdapter;
import com.maqianyu.carhome.ui.adapter.RotateArticleAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;

import static com.maqianyu.carhome.R.mipmap.ahlib_arrow_gray_up;

/**
 * Created by dllo on 16/9/9.
 * 推荐-优创+
 */
public class ArticleUnihubFragment extends AbsBaseFragment implements VolleyResult{
    private ImageView showAll;
    private View viewview;
    private TextView textViewAll;
    private TextView textView;
    private  String url;
    private ListView listView;
    private ArticleUnihubAdapter articleUnihubAdapter;

    private static final int TIME = 3000;
    private ViewPager viewPager;
    private LinearLayout pointLl;// 轮播状态改变的小圆点容器
    private List<RotateBean> datas;
    private RotateArticleAdapter vpAdapter;
    private Handler handler;
    private boolean isRotate = false;
    private Runnable rotateRunnable;

    public static ArticleUnihubFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        ArticleUnihubFragment fragment = new ArticleUnihubFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int setLayout() {
        return R.layout.fragment_article_unihub;
    }

    @Override
    protected void initViews() {
        showAll = byView(R.id.article_uniHub_show_all);
        textViewAll = byView(R.id.article_all_tv);
        viewview = byView(R.id.view);
        listView = byView(R.id.article_uniHub_listView);
        articleUnihubAdapter = new ArticleUnihubAdapter(context);
        listView.setAdapter(articleUnihubAdapter);

        viewPager =byView(R.id.rotate_unihub_vp);
        pointLl = byView(R.id.rotate_unihub_point_container);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url = bundle.getString("url");
        PopUnihub();// 点击弹出popWindow,选择全部,优选,我的关注
        VolleyInstance.getInstance().startRequest(url,this);


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
    private void PopUnihub() {
        textViewAll.setText("优选");
        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(getContext()).inflate(R.layout.article_pop_unihub, null);
                LinearLayout linearLayout;
                final TextView qbtv, wdgztv, yxtv;
                final ImageView selectetrue1,selectetrue2,selectetrue3;
                selectetrue1 = (ImageView) view.findViewById(R.id.select_true1);
                selectetrue2 = (ImageView) view.findViewById(R.id.select_true2);
                selectetrue3 = (ImageView) view.findViewById(R.id.select_true3);
                linearLayout = (LinearLayout) view.findViewById(R.id.article_unihub_pop_linearLayout);
                qbtv = (TextView) view.findViewById(R.id.qbTv);
                wdgztv = (TextView) view.findViewById(R.id.wdgzTv);
                yxtv = (TextView) view.findViewById(R.id.yxTv);
                final PopupWindow popupWindow = new PopupWindow(linearLayout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setContentView(view);
                popupWindow.setFocusable(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                       showAll.setImageResource(R.mipmap.ahlib_arrow_gray_down);
                    }
                });
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.showAsDropDown(viewview);
                showAll.setImageResource(R.mipmap.ahlib_arrow_gray_up);

                yxtv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        qbtv.setTextColor(Color.BLACK);
                        yxtv.setTextColor(Color.BLUE);
                        wdgztv.setTextColor(Color.BLACK);
                        textViewAll.setText("优选");
                        selectetrue1.setVisibility(View.VISIBLE);
                        selectetrue2.setVisibility(View.GONE);
                        selectetrue3.setVisibility(View.GONE);
                    }
                });
                qbtv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        qbtv.setTextColor(Color.BLUE);
                        yxtv.setTextColor(Color.BLACK);
                        wdgztv.setTextColor(Color.BLACK);
                        textViewAll.setText("全部");
                        selectetrue2.setVisibility(View.VISIBLE);
                        selectetrue1.setVisibility(View.GONE);
                        selectetrue3.setVisibility(View.GONE);
                    }
                });
                wdgztv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        qbtv.setTextColor(Color.BLACK);
                        yxtv.setTextColor(Color.BLACK);
                        wdgztv.setTextColor(Color.BLUE);
                        textViewAll.setText("我的关注");
                        selectetrue3.setVisibility(View.VISIBLE);
                        selectetrue1.setVisibility(View.GONE);
                        selectetrue2.setVisibility(View.GONE);
                    }
                });

                if (textViewAll.getText().equals("全部")) {
                    qbtv.setTextColor(Color.BLUE);
                    selectetrue1.setVisibility(View.GONE);
                    selectetrue3.setVisibility(View.GONE);
                    selectetrue2.setVisibility(View.VISIBLE);
                }
                else if (textViewAll.getText().equals("优选")) {
                    yxtv.setTextColor(Color.BLUE);
                    selectetrue1.setVisibility(View.VISIBLE);
                    selectetrue2.setVisibility(View.GONE);
                    selectetrue3.setVisibility(View.GONE);
                }
                else if (textViewAll.getText().equals("我的关注")) {
                    wdgztv.setTextColor(Color.BLUE);
                    selectetrue1.setVisibility(View.GONE);
                    selectetrue2.setVisibility(View.GONE);
                    selectetrue3.setVisibility(View.VISIBLE);
                }
            }
        });
    }
    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        ArticleUnihubBean articleUnihubBean  =gson.fromJson(resultStr,ArticleUnihubBean.class);
        List<ArticleUnihubBean.ResultBean.NewslistBean>datas = articleUnihubBean.getResult().getNewslist();
        articleUnihubAdapter.setDatas(datas);
        Log.d("qqqq", "datas.size():" + datas.size());
        Log.d("qqqq", resultStr);

    }
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
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_1));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_2));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_3));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_4));
        datas.add(new RotateBean(NetUrl.ARTICLE_LUNBO_5));
    }
}
