package com.maqianyu.carhome.ui.fragment.forum;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/9.
 * 论坛-常用论坛
 */
public class ForumStockFragment extends AbsBaseFragment {
    private  String url;

    public static ForumStockFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString("url",url);
        ForumStockFragment fragment = new ForumStockFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int setLayout() {
        return R.layout.fargment_forum_stock;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {

        Bundle bundle = getArguments();
        url = bundle.getString("url");
    }
}
