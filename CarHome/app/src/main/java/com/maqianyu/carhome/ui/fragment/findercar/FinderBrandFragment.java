package com.maqianyu.carhome.ui.fragment.findercar;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderBrandBean;
//import com.maqianyu.carhome.ui.adapter.FinderBrandAdapter;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.maqianyu.carhome.ui.adapter.FinderBrandAdapter;
import com.maqianyu.carhome.ui.adapter.FinderBrandRvAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 16/9/10.
 * 找车-品牌
 */
public class FinderBrandFragment extends AbsBaseFragment {
    private String url;
    private FinderBrandAdapter finderBrandAdapter;
    private FinderBrandRvAdapter finderBrandRvAdapter;
    private RecyclerView recyclerView;
    private ExpandableListView expandableListView;
    private DrawerLayout drawerLayout;
    private LinearLayout drawerLl;

    public static FinderBrandFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
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
        finderBrandAdapter  =new FinderBrandAdapter(context);
        expandableListView =byView(R.id.finder_brand_exlistview);
        recyclerView = byView(R.id.finder_brand_recyclerView);
        drawerLayout = byView(R.id.finder_drawerlayout);
        drawerLl = byView(R.id.drawer_Ll);
        // 热门品牌.recyclerView的加载
        finderBrandRvAdapter = new FinderBrandRvAdapter(context);
        recyclerView.setAdapter(finderBrandRvAdapter);

    }
    @Override
    protected void initData() {
        hotbread();// 热门品牌
    }

    private void hotbread() {
        GridLayoutManager llManager = new GridLayoutManager(context,5);
        recyclerView.setLayoutManager(llManager);
        Bundle bundle = getArguments();
        url = bundle.getString("url");

        // 品牌-热门品牌加载
        VolleyInstance.getInstance().startRequest(url, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson =new Gson();
                FinderBrandHotBean bean = gson.fromJson(resultStr,FinderBrandHotBean.class);
                List<FinderBrandHotBean.ResultBean.ListBean> datas = bean.getResult().getList();
                finderBrandRvAdapter.setDatas(datas);
            }
            @Override
            public void failure() {
            }
        });
        finderBrandRvAdapter.setForumIntance(new ForumIntance() {
            @Override
            public void ForumItemListener(int position, Object o) {
                drawerLayout.openDrawer(drawerLl);
                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_OPEN);

                drawerLayout.setDrawerListener(new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                    }
                    @Override
                    public void onDrawerOpened(View drawerView) {
                        drawerLayout.setClickable(true);
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {

                    }
                });
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        LayoutInflater.from(getContext()).inflate(R.menu.main,null);
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
