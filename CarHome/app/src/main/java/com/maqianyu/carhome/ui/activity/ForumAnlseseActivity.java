package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;

public class ForumAnlseseActivity extends AbsBaseActivity {

    private WebView webView;
    private ImageView imageView;
    @Override
    protected int setLayout() {
        return R.layout.activity_forum_anlsese;
    }

    @Override
    protected void initViews() {
        webView = byView(R.id.forum_webview);
        imageView = byView(R.id.include_back_img2);
    }

    @Override
    protected void initDatas() {
        Intent intent =getIntent();
        String id = intent.getStringExtra("id");
        String url = NetUrl.FORUM_ANSLESE_START +id + NetUrl.FORUM_ANSLESE_END;

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

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
