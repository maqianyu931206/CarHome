package com.maqianyu.carhome.ui.fragment.sale;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.RotateBean;
import com.maqianyu.carhome.ui.Bean.SaleLikeBean;
import com.maqianyu.carhome.ui.Bean.SaleRvBean;
import com.maqianyu.carhome.ui.adapter.RotateArticleAdapter;
import com.maqianyu.carhome.ui.adapter.SaleLvAdapter;
import com.maqianyu.carhome.ui.adapter.SaleRvAdapter;
import com.maqianyu.carhome.ui.adapter.SaleRvLikeAdapter;
import com.maqianyu.carhome.ui.adapter.SaleRvTJAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 发现页 Fragment
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
    private ListView listView;
    private SaleLvAdapter saleLvAdapter;
    private RecyclerView recyclerView, recyclerViewLike, recyclerViewLike2;
    private SaleRvAdapter saleRvAdapter;
    private SaleRvLikeAdapter saleRvLikeAdapter;
    private SaleRvTJAdapter saleRvTJAdapter;
    private String url;
    private RequestQueue requestQueue;

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
        listView = byView(R.id.sale_listView);
        saleLvAdapter = new SaleLvAdapter(context);
        listView.setAdapter(saleLvAdapter);
        requestQueue = Volley.newRequestQueue(context);
    }

    @Override
    protected void initData() {
        View view = LayoutInflater.from(context).inflate(R.layout.sale_headerview, null);
        viewPager = (ViewPager) view.findViewById(R.id.rotate_vp);
        pointLl = (LinearLayout) view.findViewById(R.id.rotate_point_container);
        recyclerView = (RecyclerView) view.findViewById(R.id.sale_recyclereView);
        recyclerViewLike = (RecyclerView) view.findViewById(R.id.sale_like_recyclereView);
        recyclerViewLike2 = (RecyclerView) view.findViewById(R.id.sale_like_recyclereView2);
        saleRvAdapter = new SaleRvAdapter(context);
        saleRvLikeAdapter = new SaleRvLikeAdapter(context);
        saleRvTJAdapter = new SaleRvTJAdapter(context);
        listView.addHeaderView(view);
        recyclerViewLike2.setAdapter(saleRvTJAdapter);
        recyclerViewLike.setAdapter(saleRvLikeAdapter);
        recyclerView.setAdapter(saleRvAdapter);
        GridLayoutManager llManager = new GridLayoutManager(context, 4);
        recyclerView.setLayoutManager(llManager);
        VolleyInstance.getInstance().startRequest(NetUrl.SALE_DISCOVER, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                SaleRvBean bean = gson.fromJson(resultStr, SaleRvBean.class);
                List<SaleRvBean.ResultBean.FunctionlistBean> data55 = bean.getResult().getFunctionlist();
                saleRvAdapter.setDatas(data55);
            }

            @Override
            public void failure() {
            }
        });
        GridLayoutManager llManagerlike = new GridLayoutManager(context, 2);
        recyclerViewLike.setLayoutManager(llManagerlike);
        GridLayoutManager llManagerlike2 = new GridLayoutManager(context, 2);
        recyclerViewLike2.setLayoutManager(llManagerlike2);
        VolleyInstance.getInstance().startRequest(NetUrl.SALE_DISCOVER_LIKE, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                SaleLikeBean bean = gson.fromJson(resultStr, SaleLikeBean.class);
                List<SaleLikeBean.ResultBean.ModulelistBean.ListBean> data66 = bean.getResult().getModulelist().get(0).getList();
                List<SaleLikeBean.ResultBean.ModulelistBean.ListBean> data77 = bean.getResult().getModulelist().get(1).getList();
                List<SaleLikeBean.ResultBean.GoodslistBean.ListBean> data88 = bean.getResult().getGoodslist().getList();
                saleRvLikeAdapter.setDatas(data66);
                saleRvTJAdapter.setDatas(data77);
                saleLvAdapter.setDatas(data88);
            }

            @Override
            public void failure() {

            }
        });
        dsalelunbo();//加载轮播图
        lunboinfo(); // 轮播图点击事件,进入详情
    }

    private void lunboinfo() {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        url = NetUrl.SALE_LUNBO_1;
                        break;
                    case 1:
                        url = NetUrl.SALE_LUNBO_2;
                        break;
                    case 2:
                        url = NetUrl.SALE_LUNBO_3;
                        break;
                    case 3:
                        url = NetUrl.SALE_LUNBO_4;
                        break;
                    case 4:
                        url = NetUrl.SALE_LUNBO_5;
                        break;

                }
                PopupWindow popupWindow = new PopupWindow();
                final View view = LayoutInflater.from(context).inflate(R.layout.sale_pw, null);
                popupWindow.setContentView(view);
                popupWindow.setFocusable(true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
//                popupWindow.showAtLocation(view, Gravity.LEFT, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                final ImageView imageView;
                imageView = (ImageView) view.findViewById(R.id.sale_pw_img);
                StringRequest ss = new StringRequest(url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        RotateBean bean = gson.fromJson(response, RotateBean.class);
                        Picasso.with(context).load(bean.getImgUrl()).into(imageView);

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });

                requestQueue.add(ss);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.d("SaleFragment", "state:" + state);
            }
        });


    }

    private void dsalelunbo() {
        buildDatas();//轮播图构造数据
        vpAdapter = new RotateArticleAdapter(datas, context);
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
            pointIv.setPadding(5, 5, 5, 5);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(45, 45);
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
