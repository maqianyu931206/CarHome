package com.maqianyu.carhome.ui.fragment.findercar;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/10.
 */
public class FinderUsedcarsFragment extends AbsBaseFragment {
    private  String url;

    public static FinderUsedcarsFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString("url",url);
        FinderUsedcarsFragment fragment = new FinderUsedcarsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_finder_usercars;
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
