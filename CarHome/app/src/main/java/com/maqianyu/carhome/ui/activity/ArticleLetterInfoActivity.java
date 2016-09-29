package com.maqianyu.carhome.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleLetterInfoBean;
import com.maqianyu.carhome.ui.adapter.ArticleLetterInfoAdapter;
import com.maqianyu.carhome.ui.inteface.VolleyResult;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/14.
 * 推荐-快报-详情
 */
public class ArticleLetterInfoActivity extends AbsBaseActivity implements VolleyResult{
    private  String middle ;
    private ArticleLetterInfoAdapter articleLetterInfoAdapter;
    private ListView listView;
    private TextView authernametv,timetv,summerytv,authornametv2,numtv,titletv;
    private ImageView img , headingimg;
    @Override
    protected int setLayout() {
        return R.layout.activity_article_letter_info;
    }
    @Override
    protected void initViews() {
        listView  = byView(R.id.article_letter_info_lv);
        authernametv =byView(R.id.item_article_letter_info_author_tv);
        timetv  =byView(R.id.item_article_letter_info_createtime_tv);
        summerytv = byView(R.id.item_article_letter_info_summary_tv);
        img = byView(R.id.item_article_letter_info_img);
        headingimg = byView(R.id.item_article_letter_info_heading_img);
        authornametv2 = byView(R.id.item_article_letter_info_author2_tv);
        titletv  =byView(R.id.item_article_letter_info_title_tv);
        numtv = byView(R.id.item_article_letter_info_num_tv);

    }
    @Override
    protected void initDatas() {
        Intent intent = getIntent();
        intent.getStringExtra("title");
        middle = intent.getStringExtra("id");
        String url = NetUrl.ARTICLE_LETTER_INFO_START+ middle +NetUrl.ARTICLE_LETTER_INFO_END;
        VolleyInstance.getInstance().startRequest(url,this);
        Log.d("ArticleLetterInfoActivi", url);
        articleLetterInfoAdapter = new ArticleLetterInfoAdapter(this);
        listView.setAdapter(articleLetterInfoAdapter);
    }
    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        Log.d("ggg", resultStr);
        ArticleLetterInfoBean articleLetterInfoBean = gson.fromJson(resultStr,ArticleLetterInfoBean.class);
        List<ArticleLetterInfoBean.ResultBean.MessagelistBean> datas = articleLetterInfoBean.getResult().getMessagelist();
        ArticleLetterInfoBean.ResultBean newsdataBean = articleLetterInfoBean.getResult();
        articleLetterInfoAdapter.setDatas(datas);

        authernametv.setText(newsdataBean.getNewsdata().getNewsauthor());
        timetv.setText(newsdataBean.getNewsdata().getCreatetime());
        summerytv.setText(newsdataBean.getNewsdata().getSummary());
        titletv.setText(newsdataBean.getNewsdata().getTitle());
        numtv.setText(newsdataBean.getNewsdata().getReviewcount() + "人浏览");
        authornametv2.setText("编辑:" + newsdataBean.getNewsdata().getNewsauthor());
        Picasso.with(this).load(newsdataBean.getNewsdata().getImg()).resize(440,200).config(Bitmap.Config.ALPHA_8).into(img);
        if (newsdataBean.getNewsdata().getHeadimg() != "") {
            Picasso.with(this).load(newsdataBean.getNewsdata().getHeadimg()).into(headingimg);
        }
        if (newsdataBean.getNewsdata().getHeadimg() == "") {
            headingimg.setImageResource(R.mipmap.morentouxiang);
        }
    }

    @Override
    public void failure() {
        Toast.makeText(this, "sss", Toast.LENGTH_SHORT).show();
    }
}
