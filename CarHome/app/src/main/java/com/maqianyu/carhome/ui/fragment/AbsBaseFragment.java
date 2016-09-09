package com.maqianyu.carhome.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maqianyu.carhome.ui.activity.AbsBaseActivity;

/**
 * Created by dllo on 16/9/9.
 */
public abstract class AbsBaseFragment extends Fragment {

    private  Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
       this.context = context;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(setLayout(),container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }
    protected  abstract  int setLayout();
    protected  abstract  void  initViews();
    protected  abstract  void  initData();

    // 简化findViewById
    protected    <T extends  View > T byView(int resId){
        return  (T) getView().findViewById(resId);
    }

    protected  void  goTo(Class<? extends AbsBaseActivity>to){
        context.startActivity(new Intent(context,to));
    }


}
