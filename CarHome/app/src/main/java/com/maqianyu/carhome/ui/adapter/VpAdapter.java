package com.maqianyu.carhome.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 首页使用的适配器
 * 联动使用
 */
public class VpAdapter  extends FragmentPagerAdapter{
    private List<Fragment>fragments;

    public VpAdapter(FragmentManager fm,List<Fragment>fragments) {
        super(fm);
        this.fragments = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
