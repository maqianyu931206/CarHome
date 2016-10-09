package com.maqianyu.carhome.ui.fragment.my;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.EventBusBean;
import com.maqianyu.carhome.ui.activity.LoginActivity;
import com.maqianyu.carhome.ui.activity.MySetActivity;
import com.maqianyu.carhome.ui.activity.SaveActivity;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by dllo on 16/9/9.
 * 我-Fragment
 */
public class MyFragment extends AbsBaseFragment {
    private TextView login;
    private LinearLayout linearLayoutSave,set;

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
        login = byView(R.id.login);
        linearLayoutSave = byView(R.id.my_save);
        set  = byView(R.id.set);
    }

    @Override
    protected void initData() {
        linearLayoutSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SaveActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LoginActivity.class);
                context.startActivity(intent);
                startActivityForResult(intent,100);
            }
        });

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MySetActivity.class);
                context.startActivity(intent);
            }
        });
        SharedPreferences sharedPreferences = context.getSharedPreferences("login", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("name","默认");
        login.setText(s);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 200){
           login.setText(data.getStringExtra("111"));
        }
    }



}
