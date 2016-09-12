package com.maqianyu.carhome.ui.fragment.findercar;

import android.graphics.Color;
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
public class FinderFragment extends AbsBaseFragment {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  int i;
    String str[] = new String[]{"品牌","筛选","降价","找二手车"};
    @Override
    protected int setLayout() {
        return R.layout.fragment_findercar;
    }

    @Override
    protected void initViews() {
        tabLayout =byView(R.id.findcar_tl);
        viewPager = byView(R.id.findcar_vp);
    }

    @Override
    protected void initData() {
        List<Fragment>datas = new ArrayList<>();
        switch (datas.size()) {
            case 0:
                datas.add(new FinderBrandFragment());
            case 1:
                datas.add(new FinderFilterFragment());
            case 2:
                datas.add(new FinderPriceFragment());
            case 3:
                datas.add(new FinderUsedcarsFragment());
        }
        VpAdapter vpAdapter  =new VpAdapter(getChildFragmentManager(),datas);
        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for ( i = 0; i < 4; i++) {
            tabLayout.getTabAt(i).setText(str[i]);
        }
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.BLACK,Color.BLUE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelectedTabIndicatorHeight(5);


    }
}
