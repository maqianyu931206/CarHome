package com.maqianyu.carhome.ui.fragment.sale;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.RotateBean;
import com.maqianyu.carhome.ui.Bean.SaleLikeBean;
import com.maqianyu.carhome.ui.Bean.SaleRvBean;
import com.maqianyu.carhome.ui.adapter.RotateArticleAdapter;
import com.maqianyu.carhome.ui.adapter.SaleRvAdapter;
import com.maqianyu.carhome.ui.adapter.SaleRvLikeAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class SaleFragment extends AbsBaseFragment {
    // 轮播图
    private static final int TIME = 3000;
    private ViewPager viewPager;
    private LinearLayout pointLl;// 轮播状态改变的小圆点容器
    private List<RotateBean> datas;
    private RotateArticleAdapter vpAdapter;
    private boolean isRotate = false;
    private Runnable rotateRunnable;
    private Handler handler;

    private RecyclerView recyclerView,recyclerViewLike;
    private SaleRvAdapter saleRvAdapter;
    private SaleRvLikeAdapter saleRvLikeAdapter;

    public static SaleFragment newInstance() {
        Bundle args = new Bundle();
        SaleFragment fragment = new SaleFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_sale;
    }

    @Override
    protected void initViews() {
        viewPager =byView(R.id.rotate_vp);
        pointLl = byView(R.id.rotate_point_container);
        recyclerView = byView(R.id.sale_recyclereView);
        recyclerViewLike  =byView(R.id.sale_like_recyclereView);
        saleRvAdapter = new SaleRvAdapter(context);
        recyclerView.setAdapter(saleRvAdapter);
        saleRvLikeAdapter = new SaleRvLikeAdapter(context);
        recyclerViewLike.setAdapter(saleRvLikeAdapter);
    }

    @Override
    protected void initData() {
        GridLayoutManager llManager = new GridLayoutManager(context,4);
        recyclerView.setLayoutManager(llManager);
        VolleyInstance.getInstance().startRequest(NetUrl.SALE_DISCOVER, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson  =new Gson();
                SaleRvBean bean = gson.fromJson(resultStr,SaleRvBean.class);
                List<SaleRvBean.ResultBean.FunctionlistBean> data55 = bean.getResult().getFunctionlist();
                saleRvAdapter.setDatas(data55);
            }
            @Override
            public void failure() {

            }
        });
        GridLayoutManager llManagerlike = new GridLayoutManager(context,2);
        recyclerViewLike.setLayoutManager(llManagerlike);
        VolleyInstance.getInstance().startRequest(NetUrl.SALE_DISCOVER_LIKE, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson  =new Gson();
                SaleLikeBean bean = gson.fromJson(resultStr,SaleLikeBean.class);
                List<SaleLikeBean.ResultBean.ModulelistBean.ListBean> data66 = bean.getResult().getModulelist().get(0).getList();
                saleRvLikeAdapter.setDatas(data66);

            }
            @Override
            public void failure() {

            }
        });
        dsalelunbo();//加载轮播图
    }

    private void dsalelunbo() {
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
        datas.add(new RotateBean(NetUrl.SALE_LUNBO_1));
        datas.add(new RotateBean(NetUrl.SALE_LUNBO_2));
        datas.add(new RotateBean(NetUrl.SALE_LUNBO_3));
        datas.add(new RotateBean(NetUrl.SALE_LUNBO_4));
        datas.add(new RotateBean(NetUrl.SALE_LUNBO_5));
    }

}
