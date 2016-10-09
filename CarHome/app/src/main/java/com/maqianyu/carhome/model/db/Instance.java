package com.maqianyu.carhome.model.db;

import com.litesuits.orm.LiteOrm;
import com.litesuits.orm.db.assit.QueryBuilder;
import com.litesuits.orm.db.assit.WhereBuilder;
import com.maqianyu.carhome.ui.app.MyApp;

import java.util.List;

/**
 * Created by dllo on 16/10/9.
 * 1.导入jar包
 * 2.addAsLibrary
 * 3.创建实体类
 * 4.单例LiteOrm
 */
public class Instance {

    private static  final  String DB_NAME = "collect.db"; // 数据库名字
    private LiteOrm liteOrm;
    private static Instance instance;

    public Instance() {
        liteOrm = LiteOrm.newSingleInstance(MyApp.getContext(),DB_NAME);
        liteOrm.setDebugged(true);
    }

    public static Instance getInstance() {
        if (instance == null){
            synchronized (Instance.class){
                if (instance == null){
                    instance = new Instance();
                }
            }
        }
        return instance;
    }

    //增
    public  void  insert(Bean bean){
        if (liteOrm != null){
            liteOrm.insert(bean);
        }
    }
    public  void  insert(List<Bean> beanList){
        liteOrm.insert(beanList);
    }
    //删

    //改

    //查
    public List<Bean>queryAll(){
        return  liteOrm.query(Bean.class);
    }
    // 根据条件查询
    public  List<Bean>querytitle(Object title){
        QueryBuilder<Bean>queryBuilder = new QueryBuilder<>(Bean.class);
        queryBuilder.where("title = ?",new Object[]{title});
        return  liteOrm.query(queryBuilder);
    }
    //限制想要多少条数据(参数2)
    public  List<Bean>querytitle2(Object title,int start,int end) {
        QueryBuilder<Bean>qb = new QueryBuilder<>(Bean.class);
        qb.where("title = ?" ,new Object[]{title});
        //判断end不要超过数据库的长度
        qb.limit(start,end);
        return liteOrm.query(qb);
    }
}
