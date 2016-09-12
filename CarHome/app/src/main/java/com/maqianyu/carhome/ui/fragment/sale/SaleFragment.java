package com.maqianyu.carhome.ui.fragment.sale;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/9.
 */
public class SaleFragment extends AbsBaseFragment {

    public static SaleFragment newInstance() {
        
        Bundle args = new Bundle();
        
        SaleFragment fragment = new SaleFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    protected int setLayout() {
        return R.layout.fragment_sale;
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void initData() {

    }
}
