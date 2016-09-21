package com.maqianyu.carhome.ui.fragment.findercar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

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
    private  ListView recyclerViewLongName;
    private DrawerLayout drawerLayout;
    private LinearLayout drawerLl;
    // 抽屉里的listView radioButton
    private ListView listView;
    private TextView textViewname;
    private RadioButton radioButtonshow, radioButtonall;
    private FinderBrandDrawerAdapter finderBrandDrawerAdapter;
    private FinderBrandHotBean bean;
    private String url11;

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
        recyclerViewLongName = byView(R.id.finder_brand_CarName_listView);
        recyclerViewLongName.setAdapter(finderBrandCarNameLvAdapter);

        finderBrandRvAdapter = new FinderBrandRvAdapter(context);
        recyclerView = byView(R.id.finder_brand_recyclerView);
        drawerLayout = byView(R.id.finder_drawerlayout);
        drawerLl = byView(R.id.drawer_Ll);

        // 热门品牌.recyclerView的加载
        recyclerView.setAdapter(finderBrandRvAdapter);
        radioButtonshow = byView(R.id.finder_brand_rb_show);
        radioButtonall = byView(R.id.finder_brand_rb_all);
        textViewname = byView(R.id.item_finder_drawer_name_tv);
        // 抽屉ListView数据的初始化
        listView = byView(R.id.finder_brand_drawer_listView);
        finderBrandDrawerAdapter = new FinderBrandDrawerAdapter(context);
        listView.setAdapter(finderBrandDrawerAdapter);

    }

    @Override
    protected void initData() {
        hotbread();// 热门品牌
        getCarDatas(); // 找车-车名的列表
    }

    // 找车-车名的列表
    private void getCarDatas() {
        VolleyInstance.getInstance().startRequest(NetUrl.FINDER_BRAND_CAR_NAME, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
//                List<FinderBrandCarNameBean.ResultBean.BrandlistBean.ListBean> datas2 = new ArrayList<>();
                FinderBrandCarNameBean bean2 = gson.fromJson(resultStr, FinderBrandCarNameBean.class);
//                for (int i = 0; i < bean2.getResult().getBrandlist().size(); i++) {
                    List<FinderBrandCarNameBean.ResultBean.BrandlistBean> datas = bean2.getResult().getBrandlist();
//                    datas2.addAll(datas);
//                }
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
                String middleurl = bean.getResult().getList().get(position).getId() + "";
                final String allurl = NetUrl.FINDER_BRAND_START + middleurl + NetUrl.FINDER_BRAND_END;
                final String showurl = NetUrl.FINDER_BRAND_START_SHOW + middleurl + NetUrl.FINDER_BRAND_END_SHOW;
                Log.d("hhh", showurl);
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
                buildlistDatas();
            }

            private void buildlistDatas() {
                VolleyInstance.getInstance().startRequest(url11, new VolleyResult() {
                    @Override
                    public void success(String resultStr) {
                        Gson gson = new Gson();
                        FinderBrandDrawerBean bean = gson.fromJson(resultStr, FinderBrandDrawerBean.class);
                        List<FinderBrandDrawerBean.ResultBean.FctlistBean> datas = bean.getResult().getFctlist();
                        if (datas.size() == 3) {
                            Log.d("jjj", "datas.size():" + datas.size());
                            List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean> data1 = bean.getResult().getFctlist().get(0).getSerieslist();
                            List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean> data2 = bean.getResult().getFctlist().get(1).getSerieslist();
                            List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean> data3 = bean.getResult().getFctlist().get(2).getSerieslist();
                            data1.addAll(data2);
                            data1.addAll(data3);
                            finderBrandDrawerAdapter.setDatas(data1);
                            if (datas.get(0).getName() != datas.get(1).getName()) {
                                textViewname.setText(datas.get(1).getName());
                            }
                            if (datas.get(1).getName() != datas.get(2).getName()) {
                                textViewname.setText(datas.get(2).getName());
                            }
                            Log.d("xxx", "finderBrandDrawerAdapter:" + finderBrandDrawerAdapter);
                        }
                        if (datas.size() == 1) {
                            List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean> data1 = bean.getResult().getFctlist().get(0).getSerieslist();
                            if (data1.size() != 0) {
                                finderBrandDrawerAdapter.setDatas(data1);
                            }
                        }
                    }

                    @Override
                    public void failure() {

                    }
                });
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        LayoutInflater.from(getContext()).inflate(R.menu.main, null);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
