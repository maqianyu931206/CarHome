package com.maqianyu.carhome.ui.fragment.article;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.ui.adapter.VpAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 推荐
 */
public class ArticleFragment extends AbsBaseFragment {
    private Context context;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int i;
    String str[] = new String[]{"最新", "优创+", "快报", "视频", "新闻", "评测", "导购", "行情", "用车", "技术", "文化", "改装", "游记", "原创视频", "说客"};
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
        datas.add(ArticleNewFragment.newInstance(NetUrl.ARTICLE_NEW));
        datas.add(ArticleUnihubFragment.newInstance(NetUrl.ARTICLE_UNIHUB));
        datas.add(ArticleLettersFragment.newInstance(NetUrl.ARTICLE_LETTER));
        datas.add(ArticleMediaFragment.newInstance(NetUrl.ARTICLE_MEDIA));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_NEWS));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_EVALUATION));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_SHOPPING));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_QUOTATION));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_USECAR));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_TECHNOLOGY));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_CULTURE));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_CONVERSION));
        datas.add(ArticleCopyFragment.newInstance(NetUrl.ARTICLE_TRAVELNOTES));
        datas.add(ArticleMediaFragment.newInstance(NetUrl.ARTICLE_ORIGINAL_VIDEO));
        datas.add(ArticleLobbyistFragment.newInstance(NetUrl.ARTICLE_LOBBYIST));
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
