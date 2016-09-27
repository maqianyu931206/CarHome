package com.maqianyu.carhome.ui.activity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ListView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.SQHelper;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.SQBean;
import com.maqianyu.carhome.ui.adapter.SQAdapter;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class SaveActivity extends AbsBaseActivity {
    private SQLiteDatabase sqLiteDatabase;
    private SQHelper sqHelper;
    private ListView listView;
    private SQAdapter sqAdapter;
    private List<SQBean> datas;
    @Override
    protected int setLayout() {
        return R.layout.my_save;
    }

    @Override
    protected void initViews() {
        sqHelper = new SQHelper(this,"carhome.dp",null,1);
        sqLiteDatabase = sqHelper.getReadableDatabase();
        listView = (ListView) findViewById(R.id.mysave_liv);
        sqAdapter = new SQAdapter(this);
        listView.setAdapter(sqAdapter);
        datas = new ArrayList<>();
    }

    @Override
    protected void initDatas() {
        Cursor cursor = sqLiteDatabase.query("carHome",null,null,null,null,null,null);
        while (cursor.moveToNext()) {
            String title = cursor.getString(cursor.getColumnIndex("name"));
            String price = cursor.getString(cursor.getColumnIndex("name2"));
            SQBean sqBean = new SQBean(title,price);
            datas.add(sqBean);
        }
        cursor.close();
        sqAdapter.setDatas(datas);
    }
}
