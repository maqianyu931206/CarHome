package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;

/**
 * Created by dllo on 16/9/13.
 * 推荐-复用的详情页
 */
public class ArticleCopyInfoActivity extends AbsBaseActivity {

    private WebView webView;
    private RecyclerView recyclerView;
    private  ImageView imageView;
    private String middleurl;

    @Override
    protected int setLayout() {
        return R.layout.article_info_news;
    }

    @Override
    protected void initViews() {
        webView = byView(R.id.webview);
        imageView  = byView(R.id.include_back_img2);
    }
    @Override
    protected void initDatas() {
        Intent intent = getIntent();
        middleurl = intent.getStringExtra("id");
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
        webView.loadUrl(NetUrl.ARTICLE_COPY_URLSTART + middleurl + NetUrl.ARTICLE_COPY_URLEND);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });

    }
}
