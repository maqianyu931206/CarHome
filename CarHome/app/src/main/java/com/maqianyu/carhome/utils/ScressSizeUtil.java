package com.maqianyu.carhome.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by dllo on 16/9/13.
 */
public class ScressSizeUtil {
    public static int getScreenSize(Context context, int State) {
        // 获取窗口管理者
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        // 创建显示尺寸类
        DisplayMetrics metrics = new DisplayMetrics();
        // 将窗口的额尺寸设置给显示尺寸类
        manager.getDefaultDisplay().getMetrics(metrics);
        // 返回屏幕高度
        switch (State) {
            case 1:
                return metrics.widthPixels;
            case 2:
                return metrics.heightPixels;
            default:
                return metrics.heightPixels;
        }
    }
}
