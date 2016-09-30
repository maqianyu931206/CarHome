package com.maqianyu.carhome.ui.fragment.findercar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderBrandCarNameBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandDrawerBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.maqianyu.carhome.ui.adapter.FinderBrandCarNameLvAdapter;
import com.maqianyu.carhome.ui.adapter.FinderBrandDrawerAdapter;
import com.maqianyu.carhome.ui.adapter.FinderBrandRvAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.maqianyu.carhome.ui.inteface.VolleyResult;
import com.maqianyu.carhome.view.SlideBar;

import java.util.List;

/**
 * Created by dllo on 16/9/10.
 * 找车-品牌
 */
public class FinderBrandFragment extends AbsBaseFragment {
    private String url;
    private FinderBrandCarNameLvAdapter finderBrandCarNameLvAdapter;
    private FinderBrandRvAdapter finderBrandRvAdapter;
    private RecyclerView recyclerView;
    private ListView listViewLongName;
    // 抽屉里的listView radioButton
    private DrawerLayout drawerLayout;
    private LinearLayout drawerLl;
    private ListView listView;
    private TextView textViewname;
    private RadioButton radioButtonshow, radioButtonall;
    private FinderBrandDrawerAdapter finderBrandDrawerAdapter;
    private FinderBrandHotBean bean;
    private String url11;
    private SlideBar slideBar;
    private TextView float_letter;

    public static FinderBrandFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url", url);
        FinderBrandFragment fragment = new FinderBrandFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_findcar_brand;
    }

    @Override
    protected void initViews() {
        // 所有车的加载
        finderBrandCarNameLvAdapter = new FinderBrandCarNameLvAdapter(context);
        listViewLongName = byView(R.id.finder_brand_CarName_listView);
        listViewLongName.setAdapter(finderBrandCarNameLvAdapter);
        // 抽屉ListView数据的初始化
        drawerLayout = byView(R.id.finder_drawerlayout);
        drawerLl = byView(R.id.drawer_Ll);
        listView = byView(R.id.finder_brand_drawer_listView);
        textViewname = byView(R.id.item_finder_drawer_name_tv);
        radioButtonshow = byView(R.id.finder_brand_rb_show);
        radioButtonall = byView(R.id.finder_brand_rb_all);
        finderBrandDrawerAdapter = new FinderBrandDrawerAdapter(context);
        listView.setAdapter(finderBrandDrawerAdapter);
        // 联动数据初始化
        slideBar = byView(R.id.slideBar);
        float_letter = byView(R.id.float_letter);
    }

    @Override
    protected void initData() {
        // 热门品牌.recyclerView的加载 ,加载头布局
        View view = LayoutInflater.from(context).inflate(R.layout.finder_header_rv, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.finder_brand_recyclerView);
        finderBrandRvAdapter = new FinderBrandRvAdapter(context);
        hotbread();// 热门品牌
        listViewLongName.addHeaderView(view);
        recyclerView.setAdapter(finderBrandRvAdapter);

        getCarDatas(); // 找车-车名的列表
        slidebar(); // 实现联动

    }

    // 联动效果的实现
    private void slidebar() {
        slideBar.setOnTouchLetterChangeListenner(new SlideBar.OnTouchLetterChangeListenner() {
            @Override
            public void onTouchLetterChange(MotionEvent event, String s) {
                float_letter.setText(s);
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        float_letter.setVisibility(View.GONE);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        float_letter.setVisibility(View.VISIBLE);
                        break;
                    case MotionEvent.ACTION_UP:
                    default:
                        float_letter.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                float_letter.setVisibility(View.VISIBLE);
                            }
                        }, 100);
                        break;
                }
                int position = finderBrandCarNameLvAdapter.indexOf(s);//这个array就是传给自定义Adapter的
                int position2 = position + 1;
                listViewLongName.smoothScrollToPositionFromTop(position2, 0);//调用ListView的setSelection()方法就可实现了
                finderBrandCarNameLvAdapter.notifyDataSetChanged();
            }
        });
    }

    // 找车-车名的列表
    private void getCarDatas() {
        VolleyInstance.getInstance().startRequest(NetUrl.FINDER_BRAND_CAR_NAME, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                FinderBrandCarNameBean bean2 = gson.fromJson(resultStr, FinderBrandCarNameBean.class);
                List<FinderBrandCarNameBean.ResultBean.BrandlistBean> datas = bean2.getResult().getBrandlist();
                finderBrandCarNameLvAdapter.setDatas(datas);
            }

            @Override
            public void failure() {
            }
        });

    }

    // 热门品牌的数据及抽屉
    private void hotbread() {
        GridLayoutManager llManager = new GridLayoutManager(context, 5);
        recyclerView.setLayoutManager(llManager);
        Bundle bundle = getArguments();
        url = bundle.getString("url");

        // 品牌-热门品牌加载
        VolleyInstance.getInstance().startRequest(url, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                bean = gson.fromJson(resultStr, FinderBrandHotBean.class);
                List<FinderBrandHotBean.ResultBean.ListBean> datas = bean.getResult().getList();
                finderBrandRvAdapter.setDatas(datas);
            }

            @Override
            public void failure() {
            }
        });
        // recyclerView点击事件
        finderBrandRvAdapter.setForumIntance(new ForumIntance() {
            @Override
            public void ForumItemListener(int position, Object o) {
                drawerLayout.openDrawer(drawerLl);
                drawerLl.setFocusable(true);
                String middleurl = bean.getResult().getList().get(position).getId() + "";
                final String showurl = NetUrl.FINDER_BRAND_START + middleurl + NetUrl.FINDER_BRAND_END;
                final String allurl = NetUrl.FINDER_BRAND_START_SHOW + middleurl + NetUrl.FINDER_BRAND_END_SHOW;
                url11 = showurl;
                radioButtonshow.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked == true) {
                            url11 = showurl;
                            radioButtonshow.setTextColor(Color.BLUE);
                            radioButtonall.setTextColor(Color.BLACK);
                            buildlistDatas();
                        }
                    }
                });
                radioButtonall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked == true) {
                            url11 = allurl;
                            radioButtonall.setTextColor(Color.BLUE);
                            radioButtonshow.setTextColor(Color.BLACK);
                            buildlistDatas();
                        }
                    }
                });
                buildlistDatas(); // 抽屉数据的加载
            }


        });
    }

    private void buildlistDatas() {
        VolleyInstance.getInstance().startRequest(url11, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                FinderBrandDrawerBean bean = gson.fromJson(resultStr, FinderBrandDrawerBean.class);
                List<FinderBrandDrawerBean.ResultBean.FctlistBean> datas = bean.getResult().getFctlist();
                finderBrandDrawerAdapter.setDatas(datas);
            }

            @Override
            public void failure() {

            }
        });
    }  // 抽屉加载数据

}
