package com.maqianyu.carhome.ui.Bean;

/**
 * Created by dllo on 16/9/26.
 */
public class SQBean {
    private  String title;
    private String price;


    public SQBean(String title, String price) {
        this.title = title;
        this.price = price;

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

}
