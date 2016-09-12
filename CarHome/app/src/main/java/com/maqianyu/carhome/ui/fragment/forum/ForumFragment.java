package com.maqianyu.carhome.ui.fragment.forum;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.adapter.VpAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class ForumFragment extends AbsBaseFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int i;
    String str[] = new String[]{"精选推荐", "热帖", "常用论坛"};

    public static ForumFragment newInstance() {
        Bundle args = new Bundle();
        ForumFragment fragment = new ForumFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_forum;
    }

    @Override
    protected void initViews() {
        tabLayout = byView(R.id.forum_tl);
        viewPager = byView(R.id.forum_vp);
    }

    @Override
    protected void initData() {
        List<Fragment> datas = new ArrayList<>();
        datas.add(ForumAnsleseFragment.newInstance("111"));
        datas.add(ForumForumFragment.newInstance("222"));
        datas.add(ForumStockFragment.newInstance("333"));
        VpAdapter vpAdapter = new VpAdapter(getChildFragmentManager(), datas);
        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for (i = 0; i < 3; i++) {
            tabLayout.getTabAt(i).setText(str[i]);
        }

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.BLACK, Color.BLUE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelectedTabIndicatorHeight(5);
    }
}
