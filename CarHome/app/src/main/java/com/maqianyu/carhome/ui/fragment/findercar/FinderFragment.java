package com.maqianyu.carhome.ui.fragment.findercar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.ui.adapter.VpAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 找车
 */
public class FinderFragment extends AbsBaseFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int i;
    String str[] = new String[]{"品牌", "筛选", "降价", "找二手车"};

    public static FinderFragment newInstance() {
        Bundle args = new Bundle();
        FinderFragment fragment = new FinderFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_findercar;
    }

    @Override
    protected void initViews() {
        tabLayout = byView(R.id.findcar_tl);
        viewPager = byView(R.id.findcar_vp);
    }

    @Override
    protected void initData() {
        List<Fragment> datas = new ArrayList<>();
        datas.add(FinderBrandFragment.newInstance(NetUrl.FINDER_BRAND));
        datas.add(FinderFilterFragment.newInstance(NetUrl.FINDER_BRAND_CHIOSE));
        datas.add(FinderPriceFragment.newInstance(""));
        datas.add(FinderUsedcarsFragment.newInstance(""));
        VpAdapter vpAdapter = new VpAdapter(getChildFragmentManager(), datas);
        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for (i = 0; i < 4; i++) {
            tabLayout.getTabAt(i).setText(str[i]);
        }
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.BLACK, Color.BLUE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelectedTabIndicatorHeight(5);

        viewPager.setPageTransformer(true, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(View view, float position) {
                if (position >= -1 && position <= 1) {
                    view.setPivotX(position < 0 ? view.getWidth() : 0);
                    view.setRotationY(90 * position);
                }
            }
        });
    }
}
