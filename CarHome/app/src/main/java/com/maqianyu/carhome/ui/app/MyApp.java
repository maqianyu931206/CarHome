package com.maqianyu.carhome.ui.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/9/9.
 */
public class MyApp extends Application {

    private  static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
