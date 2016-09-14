package com.maqianyu.carhome.ui.fragment.findercar;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/10.
 * 找车-降价
 */
public class FinderPriceFragment extends AbsBaseFragment {
    private String url;

    public static FinderPriceFragment newInstance(String url) {

        Bundle args = new Bundle();
        args.putString("url",url);
        FinderPriceFragment fragment = new FinderPriceFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_finder_price;
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
