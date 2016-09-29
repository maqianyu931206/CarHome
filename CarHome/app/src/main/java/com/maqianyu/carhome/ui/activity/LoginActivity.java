package com.maqianyu.carhome.ui.activity;


import android.view.View;
import android.widget.ImageView;

import com.maqianyu.carhome.R;

public class LoginActivity extends AbsBaseActivity {

    private ImageView imageViewback;

    @Override
    protected int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViews() {
        imageViewback = byView(R.id.my_login_back_img);
    }

    @Override
    protected void initDatas() {
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
