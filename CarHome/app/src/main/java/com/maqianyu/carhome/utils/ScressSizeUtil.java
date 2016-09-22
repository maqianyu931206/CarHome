package com.maqianyu.carhome.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by dllo on 16/9/22.
 */
public class ScressSizeUtil {
    /****/
    public static int getScreenWidth(Context context) {//app.context
        //首先获取窗口管理者
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //创建显示尺寸类
        DisplayMetrics metrics = new DisplayMetrics();
        //将窗口(屏幕)的尺寸设置给 显示尺寸类
        windowManager.getDefaultDisplay().getMetrics(metrics);
        //返回屏幕宽度
        return metrics.widthPixels;
    }

    /****/
    public static int getScreenHeight(Context context) {//app.context
        //首先获取窗口管理者
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        //创建显示尺寸类
        DisplayMetrics metrics = new DisplayMetrics();
        //将窗口(屏幕)的尺寸设置给 显示尺寸类
        windowManager.getDefaultDisplay().getMetrics(metrics);
        //返回屏幕高度
        return metrics.heightPixels;
    }
    /****/
    /**
     * @param context
     * @param state   状态
     * @return 传1 返回宽
     * 传2 返回高
     * 默认 返回高
     */
    public static int getScreenSize(Context context, int state) {//app.context
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        switch (state) {
            case 1:
                return metrics.widthPixels;
            case 2:
                return metrics.heightPixels;
            default:
                return -1;
        }

    }

    //在此整合
    //枚举:整型常量 一般用枚举来规定一些特殊状态
    //如 横屏竖屏全屏窗口化 播放暂停停止 宽高
    //关键字 enum 也是一种数据类型 就是一个类

    public static int getScreenSize(Context context, ScreenState state) {//app.context
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        if (state.equals(ScreenState.WIDTH)) {
            return metrics.widthPixels;
        }else if (state.equals(ScreenState.HEIGHT)){
            return metrics.heightPixels;
        }
        return metrics.heightPixels;
    }

    public enum ScreenState {
        WIDTH, HEIGHT
    }

}
