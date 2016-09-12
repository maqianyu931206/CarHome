package com.maqianyu.carhome.ui.fragment.article;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/12.
 */
public class ArticleMediaFragment extends AbsBaseFragment {
    private  String url2;

    public static ArticleMediaFragment newInstance(String url2) {
        Bundle args = new Bundle();
        args.putString("url",url2);
        ArticleMediaFragment fragment = new ArticleMediaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragmnet_article_media;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url2 = bundle.getString("url");
    }
}
