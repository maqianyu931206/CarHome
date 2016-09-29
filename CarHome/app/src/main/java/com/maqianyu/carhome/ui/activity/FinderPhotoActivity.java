package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderInfoPhotoBean;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/29.
 */
public class FinderPhotoActivity extends AbsBaseActivity {


    private Button btn, btn2;
    private WebView webview;
    private String id,id2;

    @Override
    protected int setLayout() {
        return R.layout.finder_info_photo_activity;
    }

    @Override
    protected void initViews() {
        btn = byView(R.id.btn);
        btn2 = byView(R.id.btn2);
        webview = byView(R.id.webview);
    }

    @Override
    protected void initDatas() {
        Intent intent = getIntent();
        final String middleUrl = intent.getStringExtra("id");

        VolleyInstance.getInstance().startRequest(NetUrl.FINDER_INFO_PHOTO_START + middleUrl + NetUrl.FINDER_INFO_PHOTO_END, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                FinderInfoPhotoBean bean = gson.fromJson(resultStr, FinderInfoPhotoBean.class);
                id = bean.getResult().getDefaultpiclist().get(0).getList().get(0).getId() + "";
                id2 = bean.getResult().getDefaultpiclist().get(1).getList().get(0).getId() + "";

            }

            @Override
            public void failure() {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }

                    @Override
                    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                        return super.shouldOverrideKeyEvent(view, event);
                    }
                });
                WebSettings settings = webview.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setAppCacheEnabled(true);
                settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                settings.setSupportZoom(true);
                settings.setUseWideViewPort(true);
                settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                settings.setDisplayZoomControls(true);
                settings.setDefaultFontSize(6);
                webview.loadUrl("http://comm.app.autohome.com.cn/cars/dutusharedcontent-pm1-ss" + middleUrl + "-sp26715-t1-imgid" + id + ".html");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webview.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        return false;
                    }

                    @Override
                    public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                        return super.shouldOverrideKeyEvent(view, event);
                    }
                });
                WebSettings settings = webview.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setAppCacheEnabled(true);
                settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                settings.setSupportZoom(true);
                settings.setUseWideViewPort(true);
                settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
                settings.setDisplayZoomControls(true);
                settings.setDefaultFontSize(6);
                webview.loadUrl("http://comm.app.autohome.com.cn/cars/dutusharedcontent-pm1-ss" + middleUrl + "-sp26715-t1-imgid" + id2 + ".html");

            }
        });

    }


}
