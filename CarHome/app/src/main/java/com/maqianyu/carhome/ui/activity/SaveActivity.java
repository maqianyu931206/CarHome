package com.maqianyu.carhome.ui.activity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.LiteOrmInstance;
import com.maqianyu.carhome.ui.Bean.LiteOrmBean;
import com.maqianyu.carhome.ui.adapter.MySaveLvAdapter;
import com.maqianyu.carhome.view.DeleteListView;

import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class SaveActivity extends AbsBaseActivity implements DeleteListView.RemoveListener{
    private DeleteListView listView;
    private MySaveLvAdapter mySaveLvAdapter;
    @Override
    protected int setLayout() {
        return R.layout.my_save;
    }
    @Override
    protected void initViews() {
        listView = (DeleteListView) findViewById(R.id.mysave_liv);
        mySaveLvAdapter = new MySaveLvAdapter(this);
        listView.setAdapter(mySaveLvAdapter);
    }

    @Override
    protected void initDatas() {
        listView.setRemoveListener(this);
        List<LiteOrmBean> d = LiteOrmInstance.getIntance().getQueryAll(LiteOrmBean.class);
        mySaveLvAdapter.setDatas(d);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LiteOrmBean bean = (LiteOrmBean) parent.getItemAtPosition(position);
                mySaveLvAdapter.remove(bean);
            }
        });

    }

    @Override
    public void removeItem(DeleteListView.RemoveDirection direction, int position) {
        LiteOrmInstance.getIntance().deleteOne(((LiteOrmBean) mySaveLvAdapter.getItem(position)).getTitle());
        mySaveLvAdapter.remove((LiteOrmBean) mySaveLvAdapter.getItem(position));
        switch (direction){
            case RIGHT:
                Toast.makeText(this, "向右删除", Toast.LENGTH_SHORT).show();
                break;
            case LEFT:
                Toast.makeText(this, "向左删除", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

}
