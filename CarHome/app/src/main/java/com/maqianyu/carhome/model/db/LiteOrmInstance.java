package com.maqianyu.carhome.model.db;

import android.util.Log;

import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.assit.QueryBuilder;
import com.litesuits.orm.db.assit.WhereBuilder;
import com.maqianyu.carhome.ui.Bean.LiteOrmBean;
import com.maqianyu.carhome.ui.app.MyApp;
import com.maqianyu.carhome.utils.T;

import java.util.List;

/**
 * Created by dllo on 16/10/8.
 */
public class LiteOrmInstance {
    private LiteOrm liteOrm;

    private LiteOrmInstance() {
        liteOrm = LiteOrm.newSingleInstance(MyApp.getContext(), "carhome.db");
        liteOrm.setDebugged(true);
    }

    private static LiteOrmInstance liteOrmInstance;

    public static LiteOrmInstance getIntance() {
        if (liteOrmInstance == null) {
            synchronized (LiteOrmInstance.class) {
                if (liteOrmInstance == null) {
                    liteOrmInstance = new LiteOrmInstance();
                }
            }
        }
        return liteOrmInstance;
    }

    // 插入一条数据
    public void insertOne(LiteOrmBean liteOrmBean) {
        LiteOrmBean lb = new LiteOrmBean();
        lb.setTitle(liteOrmBean.getTitle());
        lb.setPrice(liteOrmBean.getPrice());
        lb.setImgUrl(liteOrmBean.getImgUrl());
        liteOrm.insert(lb);
    }

    // 查询所有数据
    public <T> List<T> getQueryAll(Class<T> cla) {
        return liteOrm.query(cla);
    }

    // 按条件查询,删除一条数据
    public void deleteOne(Object title) {
        WhereBuilder lb = new WhereBuilder(LiteOrmBean.class);
        lb.where("title = ?", new Object[]{title});
        liteOrm.delete(lb);
    }

    // 查询一条数据
    public List<LiteOrmBean> queryOne(Object title) {
        QueryBuilder<LiteOrmBean> lb = new QueryBuilder<LiteOrmBean>(LiteOrmBean.class);
        lb.where("title = ?", new Object[]{title});
        return  liteOrm.query(lb);
    }
}
