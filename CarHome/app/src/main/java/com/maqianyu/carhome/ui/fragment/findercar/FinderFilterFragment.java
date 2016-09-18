package com.maqianyu.carhome.ui.fragment.findercar;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/10.
 * 找车-筛选
 */
public class FinderFilterFragment extends AbsBaseFragment {
    private  String url;

    public static FinderFilterFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        FinderFilterFragment fragment = new FinderFilterFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_findcar_filter;
    }
    @Override
    protected void initViews() {
    }
    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url= bundle.getString("url");
    }
}
