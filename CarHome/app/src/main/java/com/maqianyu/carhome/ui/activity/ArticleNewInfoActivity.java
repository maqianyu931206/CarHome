package com.maqianyu.carhome.ui.activity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.SQHelper;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

/**
 * Created by dllo on 16/9/13.
 * 推荐-新闻详情页
 */
public class ArticleNewInfoActivity extends AbsBaseActivity {

    private WebView webView;
    private ImageView imageView;
    private String middleurl;
    private  ImageView imageViewsave;
    private SQLiteDatabase sqLiteDatabase;
    private SQHelper sqHelper;
    private boolean is =false;

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
                ContentValues cv = new ContentValues();
                cv.put("name",intent.getStringExtra("title"));
                cv.put("name2",intent.getStringExtra("price"));
                sqHelper = new SQHelper(ArticleNewInfoActivity.this,"carhome.dp",null,1);
                sqLiteDatabase = sqHelper.getReadableDatabase();
                sqLiteDatabase.insert("carHome",null,cv);
                cv.clear();
                if (is = false) {
                    imageViewsave.setImageResource(R.mipmap.save2);
                    is =true;
                }else {
                    imageViewsave.setImageResource(R.mipmap.save);
                    is =false;
                }
            }
        });

    }
}
