package com.maqianyu.carhome.ui.fragment.article;

import android.content.Context;
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
public class ArticleFragment extends AbsBaseFragment {
    private Context context;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int i;
    String str[] = new String[]{"最新", "优创+", "快报", "视频", "新闻", "评测", "导购", "行情", "用车", "技术", "文化", "改装", "游记", "原创视频", "说客"};

    private String dataUrl = "http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html";
    private String imgUrl = "http://car3.autoimg.cn/cardfs/product/g8/M08/67/7A/w_autohomecar__wKgH3lceA4uALp8tAAXK-FdTxgU704.jpg";

    public static ArticleFragment newInstance() {
        Bundle args = new Bundle();
        ArticleFragment fragment = new ArticleFragment();
        fragment.setArguments(args);
        return fragment;
    }

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
        Bundle bundle = getArguments();
        List<Fragment> datas = new ArrayList<>();
        datas.add(ArticleNewFragment.newInstance(dataUrl));
        datas.add(ArticleUnihubFragment.newInstance("52645655"));
        datas.add(ArticleLettersFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/fastnewslist-pm2-b0-l0-s20-lastid0.json"));
        datas.add(ArticleMediaFragment.newInstance("64513"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm1-c0-nt1-p1-s30-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm1-c0-nt1-p1-s30-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm1-c0-nt1-p1-s30-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm1-c0-nt1-p1-s30-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm1-c0-nt82-p1-s20-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json"));
        datas.add(ArticleCopyFragment.newInstance("http://app.api.autohome.com.cn/autov5.0.0/news/newslist-pm2-c0-nt82-p1-s20-l0.json"));

        VpAdapter vpAdapter = new VpAdapter(getChildFragmentManager(), datas);
        viewPager.setAdapter(vpAdapter);
        tabLayout.setupWithViewPager(viewPager);
        for (i = 0; i < 15; i++) {
            tabLayout.getTabAt(i).setText(str[i]);
        }

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabTextColors(Color.BLACK, Color.BLUE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelectedTabIndicatorHeight(5);
    }
}
