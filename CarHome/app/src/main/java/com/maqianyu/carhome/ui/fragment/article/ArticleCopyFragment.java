package com.maqianyu.carhome.ui.fragment.article;

import android.os.Bundle;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/12.
 */
public class ArticleCopyFragment extends AbsBaseFragment {
    private  String url3;
    private TextView textView;

    public static ArticleCopyFragment newInstance(String url3) {
        Bundle args = new Bundle();
        args.putString("url",url3);
        ArticleCopyFragment fragment = new ArticleCopyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_article_copy;
    }

    @Override
    protected void initViews() {
        textView = byView(R.id.copy_tv);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url3 = bundle.getString("url");
        textView.setText(url3);
    }
}
