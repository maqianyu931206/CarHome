package com.maqianyu.carhome.ui.activity;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.utils.DataCleanManger;

public class MySetActivity extends AbsBaseActivity {

    private ImageView backimg;
    private TextView textViewcache,deltecache;

    @Override
    protected int setLayout() {
        return R.layout.activity_my_set;
    }

    @Override
    protected void initViews() {
        backimg = byView(R.id.my_set_back);
        textViewcache=byView(R.id.cache_tv);
        deltecache = byView(R.id.delete_cache);
    }

    @Override
    protected void initDatas() {
        backimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        try {
            textViewcache.setText(DataCleanManger.getTotalCacheSize(MySetActivity.this));
        } catch (Exception e) {
            e.printStackTrace();
        }
        deltecache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataCleanManger.clearAllCache(MySetActivity.this);
                try {
                    DataCleanManger.getTotalCacheSize(MySetActivity.this);
                    textViewcache.setText(DataCleanManger.getTotalCacheSize(MySetActivity.this));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
