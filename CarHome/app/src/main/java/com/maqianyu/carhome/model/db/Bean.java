package com.maqianyu.carhome.model.db;

import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

/**
 * Created by dllo on 16/10/9.
 */
@Table("collect")
public class Bean {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    private  int id;

    private String imgUrl;
    private  String title;

    public Bean() {
    }

    public Bean(String imgUrl, String title) {
        this.imgUrl = imgUrl;
        this.title = title;
    }

    public Bean(int id, String imgUrl, String title) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
