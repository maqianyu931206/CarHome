package com.maqianyu.carhome.utils;

import java.io.Serializable;

/**
 * Created by dllo on 16/9/20.
 */
public class Contact implements Serializable {
    private String mName;
    private int mType;

    public Contact(String name, int type) {
        mName = name;
        mType = type;
    }

    public String getmName() {
        return mName;
    }

    public int getmType() {
        return mType;
    }
}
