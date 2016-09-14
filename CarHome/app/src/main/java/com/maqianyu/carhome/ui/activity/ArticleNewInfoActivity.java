package com.maqianyu.carhome.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.maqianyu.carhome.R;

/**
 * Created by dllo on 16/9/13.
 * 推荐-新闻详情页
 */
public class ArticleNewInfoActivity extends AbsBaseActivity {

    private  String urlstart = "http://cont.app.autohome.com.cn/autov4.2.5/content/News/newscontent-a2-pm1-v4.2.5-n/ ";
    private  String middleurl;
    private  String endurl = "/-lz0-sp0-nt0-sa1-p0-c1-fs0-cw320.html";

    @Override
    protected int setLayout() {
        return R.layout.forum_pop_anslese;
    }
    @Override
    protected void initViews() {
    }

    @Override
    protected void initDatas() {
    }

}
