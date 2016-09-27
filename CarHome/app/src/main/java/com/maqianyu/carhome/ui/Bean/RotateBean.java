package com.maqianyu.carhome.ui.Bean;

import java.io.Serializable;

/**
 * Created by dllo on 16/9/12.
 * 轮播图使用的实体类
 */
public class RotateBean implements Serializable{
    private String imgUrl;


    public RotateBean( String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

