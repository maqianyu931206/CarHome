package com.maqianyu.carhome.ui.activity;


import android.view.View;
import android.widget.ImageView;

import com.maqianyu.carhome.R;

public class MySetActivity extends AbsBaseActivity {

    private ImageView backimg;

    @Override
    protected int setLayout() {
        return R.layout.activity_my_set;
    }

    @Override
    protected void initViews() {
        backimg = byView(R.id.my_set_back);
    }

    @Override
    protected void initDatas() {
        backimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
