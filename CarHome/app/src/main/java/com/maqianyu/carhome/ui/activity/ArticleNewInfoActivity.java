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

import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by dllo on 16/9/13.
 * 推荐-新闻详情页
 */
public class ArticleNewInfoActivity extends AbsBaseActivity {

    private WebView webView;
    private ImageView imageView, share;
    private String middleurl, title, img, price;
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
        share = byView(R.id.share);
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
        if (LiteOrmInstance.getIntance().queryOne(title).size() > 0) {
            imageViewsave.setImageResource(R.mipmap.save2);
            a = true;
        }

        // 分享
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnekeyShare oks = new OnekeyShare();
                //关闭sso授权
                oks.disableSSOWhenAuthorize();
                // 分享时Notification的图标和文字  2.5.9以后的版本不调用此方法
                //oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
                // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间使用
                oks.setTitle(title);
                // titleUrl是标题的网络链接，仅在人人网和QQ空间使用
                oks.setTitleUrl("http://baidu.cn");
                // text是分享文本，所有平台都需要这个字段
                oks.setText(title);
                //分享网络图片，新浪微博分享网络图片需要通过审核后申请高级写入接口，否则请注释掉测试新浪微博
                oks.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
                // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
                //oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
                // url仅在微信（包括好友和朋友圈）中使用
                oks.setUrl("http://sharesdk.cn");
                // comment是我对这条分享的评论，仅在人人网和QQ空间使用
                oks.setComment("评论文本");
                // site是分享此内容的网站名称，仅在QQ空间使用
                oks.setSite("ShareSDK");
                // siteUrl是分享此内容的网站地址，仅在QQ空间使用
                oks.setSiteUrl("http://sharesdk.cn");
                // 启动分享GUI
                oks.show(ArticleNewInfoActivity.this);
            }
        });

    }
}
