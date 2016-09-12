package com.maqianyu.carhome.model.net;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.maqianyu.carhome.ui.app.MyApp;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

/**
 * Created by dllo on 16/9/12.
 * Volley使用的单例类
 */
public class VolleyInstance {
    private  static  VolleyInstance instance;
    private RequestQueue requestQueue;
    private  VolleyInstance(){
        requestQueue  = Volley.newRequestQueue(MyApp.getContext());
    }

    public  static  VolleyInstance getInstance(){

        if (instance == null){
            synchronized (VolleyInstance.class){
                if (instance == null){
                    if (instance == null){
                        instance = new VolleyInstance();
                    }
                }
            }
        }
        return  instance;
    }


    public  void  startRequest(String url, final VolleyResult result){
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                result.success(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                result.failure();
            }
        });
    requestQueue.add(stringRequest);
    }

}
