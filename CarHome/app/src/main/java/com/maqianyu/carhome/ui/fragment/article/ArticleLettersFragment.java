package com.maqianyu.carhome.ui.fragment.article;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/12.
 */
public class ArticleLettersFragment extends AbsBaseFragment {
   private  String url1;

    public static ArticleLettersFragment newInstance(String url1) {
        Bundle args = new Bundle();
        args.putString("url",url1);
        ArticleLettersFragment fragment = new ArticleLettersFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_article_letters;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url1 = bundle.getString("url");
    }
}
