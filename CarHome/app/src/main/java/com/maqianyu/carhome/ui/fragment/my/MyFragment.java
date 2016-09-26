package com.maqianyu.carhome.ui.fragment.my;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.SQHelper;
import com.maqianyu.carhome.ui.activity.SaveActivity;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/9.
 * 我-Fragment
 */
public class MyFragment extends AbsBaseFragment {
    private TextView tv;
    private LinearLayout linearLayoutSave;
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
        linearLayoutSave = byView(R.id.my_save);
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
    }

}
