package com.maqianyu.carhome.ui.activity;

import android.widget.ListView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.LiteOrmInstance;
import com.maqianyu.carhome.ui.Bean.LiteOrmBean;
import com.maqianyu.carhome.ui.adapter.MySaveLvAdapter;

import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class SaveActivity extends AbsBaseActivity {
    private ListView listView;
    private MySaveLvAdapter mySaveLvAdapter;
    @Override
    protected int setLayout() {
        return R.layout.my_save;
    }
    @Override
    protected void initViews() {
        listView = (ListView) findViewById(R.id.mysave_liv);
        mySaveLvAdapter = new MySaveLvAdapter(this);
        listView.setAdapter(mySaveLvAdapter);
    }

    @Override
    protected void initDatas() {
        List<LiteOrmBean> d = LiteOrmInstance.getIntance().getQueryAll(LiteOrmBean.class);
        mySaveLvAdapter.setDatas(d);

    }
}
