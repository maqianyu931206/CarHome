package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.LiteOrmInstance;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.ui.Bean.LiteOrmBean;

/**
 * Created by dllo on 16/9/13.
 * 推荐-新闻详情页
 */
public class ArticleNewInfoActivity extends AbsBaseActivity {

    private WebView webView;
    private ImageView imageView;
    private String middleurl,title,img,price;
    private ImageView imageViewsave;
    private boolean a = false;

    @Override
    protected int setLayout() {
        return R.layout.article_info_news;
    }

    @Override
    protected void initViews() {
        webView = byView(R.id.webview);
        imageView = byView(R.id.include_back_img2);
        imageViewsave = byView(R.id.save);
    }

    @Override
    protected void initDatas() {
        final Intent intent = getIntent();
        middleurl = intent.getStringExtra("id");
        title = intent.getStringExtra("title");
        img = intent.getStringExtra("img");
        price = intent.getStringExtra("price");

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
        settings.setDefaultFontSize(2);
        webView.loadUrl(NetUrl.ARTICLE_URLSTSART + middleurl + NetUrl.ARTICLE_URLEND);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        imageViewsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == false) {
                    LiteOrmBean liteOrmBean = new LiteOrmBean(title, price, img);
                    LiteOrmInstance.getIntance().insertOne(liteOrmBean);
                    imageViewsave.setImageResource(R.mipmap.save2);
                    Toast.makeText(ArticleNewInfoActivity.this, "收藏成功", Toast.LENGTH_SHORT).show();
                    a = true;
                } else {
                    LiteOrmInstance.getIntance().deleteOne(title);
                    imageViewsave.setImageResource(R.mipmap.save);
                    Toast.makeText(ArticleNewInfoActivity.this, "取消收藏", Toast.LENGTH_SHORT).show();
                    a = false;
                }

            }
        });
        if (LiteOrmInstance.getIntance().queryOne(title).size() > 0){
            imageViewsave.setImageResource(R.mipmap.save2);
            a = true;
        }

    }
}
