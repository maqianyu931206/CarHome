package com.maqianyu.carhome.ui.Bean;

import com.litesuits.orm.db.annotation.NotNull;
import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by dllo on 16/10/8.
 * 数据库实体类
 */
@Table("carhome")
public class LiteOrmBean {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    private  int id;
    @NotNull
    private  String title;
    private  String price;
    private  String imgUrl;

    public LiteOrmBean() {
    }

    public LiteOrmBean(String title, String price, String imgUrl) {
        this.title = title;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public LiteOrmBean(int id, String title, String price, String imgUrl) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

