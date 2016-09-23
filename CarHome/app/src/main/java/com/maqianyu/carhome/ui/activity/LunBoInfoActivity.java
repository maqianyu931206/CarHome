package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;

/**
 * Created by dllo on 16/9/23.
 */
public class LunBoInfoActivity extends AbsBaseActivity {
    private ImageView imageViewback;
    private WebView webView;
    int i = 0;
    String url;

    @Override
    protected int setLayout() {
        return R.layout.lunboinfo;
    }

    @Override
    protected void initViews() {
        imageViewback = byView(R.id.back_img);
        webView = byView(R.id.tt);
    }

    @Override
    protected void initDatas() {
        Intent intent = getIntent();
        int a = intent.getIntExtra("ps", 0);
        if (a == 1) {
            url = NetUrl.SALE_LUNBO_11;
        }
        if (a == 0) {
            url = NetUrl.SALE_LUNBO_22;
        }
        if (a == 2) {
            url = NetUrl.SALE_LUNBO_33;
        }
        if (a == 3) {
            url = NetUrl.SALE_LUNBO_44;
        }
        if (a == 4) {
            url = NetUrl.SALE_LUNBO_55;
        }
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }

            @Override
            public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
                return super.shouldOverrideKeyEvent(view, event);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        settings.setSupportZoom(true);
        settings.setUseWideViewPort(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDisplayZoomControls(true);
        settings.setDefaultFontSize(6);
        webView.loadUrl(url);

    }

}
