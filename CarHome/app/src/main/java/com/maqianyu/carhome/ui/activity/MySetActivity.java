package com.maqianyu.carhome.ui.activity;


import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.utils.DataCleanManger;

public class MySetActivity extends AbsBaseActivity {

    private ImageView backimg;
    private TextView textViewcache,deltecache,update;
    private AlertDialog dialog;

    @Override
    protected int setLayout() {
        return R.layout.activity_my_set;
    }

    @Override
    protected void initViews() {
        backimg = byView(R.id.my_set_back);
        textViewcache=byView(R.id.cache_tv);
        deltecache = byView(R.id.delete_cache);
        update = byView(R.id.update);
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

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MySetActivity.this);
                View view = getLayoutInflater().inflate(R.layout.update,null);
                builder.setView(view);
                dialog = builder.create();
                dialog.show();
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        Toast.makeText(MySetActivity.this, "请等待下次更新", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }
}
