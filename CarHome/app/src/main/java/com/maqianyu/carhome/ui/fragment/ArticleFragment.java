package com.maqianyu.carhome.ui.fragment;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.adapter.VpAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class ArticleFragment extends AbsBaseFragment {
    private Context context;
    private TabLayout tabLayout;
    private  ViewPager viewPager;
    private  int i;
    String str[] = new String[]{"最新","优创+","快报","视频","新闻","评测","导购","行情","用车","技术","文化","改装","游记","原创视频","说客"};

    @Override
    protected int setLayout() {
        return R.layout.fragment_article;
    }

    @Override
    protected void initViews() {
        tabLayout = byView(R.id.article_tl);
        viewPager = byView(R.id.article_vp);
    }
    @Override
    protected void initData() {
        List<Fragment>datas = new ArrayList<>();
        switch (datas.size()) {
            case 0:
                datas.add(new ArticleNewFragment());
            case 1:
                datas.add(new ArticleUnihubFragment());
            case 2:
                datas.add(new ArticleNewFragment());
            case 3:
                datas.add(new ArticleUnihubFragment());
            case 4:
                datas.add(new ArticleNewFragment());
            case 5:
                datas.add(new ArticleUnihubFragment());
            case 6:
                datas.add(new ArticleNewFragment());
            case 7:
                datas.add(new ArticleUnihubFragment());
            case 8:
                datas.add(new ArticleNewFragment());
            case 9:
                datas.add(new ArticleNewFragment());
            case 10:
                datas.add(new ArticleUnihubFragment());
            case 11:
                datas.add(new ArticleNewFragment());
            case 12:
                datas.add(new ArticleNewFragment());
            case 13:
                datas.add(new ArticleUnihubFragment());
            case 14:
                datas.add(new ArticleNewFragment());
        }
        VpAdapter vpAdapter  =new VpAdapter(getChildFragmentManager(),datas);
        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for ( i = 0; i < 15; i++) {
            tabLayout.getTabAt(i).setText(str[i]);
        }

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.BLACK,Color.BLUE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelectedTabIndicatorHeight(5);

    }
}
