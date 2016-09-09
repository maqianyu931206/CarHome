package com.maqianyu.carhome.utils;

import android.widget.Toast;

import com.maqianyu.carhome.ui.app.MyApp;

/**
 * Created by dllo on 16/9/9.
 * Toast工具类
 */
public final  class T {
    // final修饰,不能继承,不能创建对象
    private T(){}
    private  static  boolean iSDebug = true;
    public  static void shortMag(String msg){
        if (iSDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }
    public  static  void  longMsg(String msg){
        if (iSDebug){
            Toast.makeText(MyApp.getContext(), msg, Toast.LENGTH_SHORT).show();
        }
    }


}
