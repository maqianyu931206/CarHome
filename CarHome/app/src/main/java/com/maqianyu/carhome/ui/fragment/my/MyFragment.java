package com.maqianyu.carhome.ui.fragment.my;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/9.
 */
public class MyFragment extends AbsBaseFragment {

    public static MyFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {

    }
}
