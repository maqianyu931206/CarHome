package com.maqianyu.carhome.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleLetterInfoBean;
import com.maqianyu.carhome.ui.adapter.ArticleLetterInfoAdapter;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/14.
 * 推荐-快报-详情
 */
public class ArticleLetterInfoActivity extends AbsBaseActivity implements VolleyResult{
    private  String middle ;
    private ArticleLetterInfoAdapter articleLetterInfoAdapter;
    private Context context;
    @Override
    protected int setLayout() {
        return R.layout.activity_article_letter_info;
    }
    @Override
    protected void initViews() {
    }
    @Override
    protected void initDatas() {
        Intent intent = getIntent();
        intent.getStringExtra("title");
        middle = intent.getStringExtra("id");
        String url = NetUrl.ARTICLE_LETTER_INFO_START+ middle +NetUrl.ARTICLE_LETTER_INFO_END;
        VolleyInstance.getInstance().startRequest(url,this);
        articleLetterInfoAdapter = new ArticleLetterInfoAdapter(context);
    }
    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        Log.d("ggg", resultStr);
        ArticleLetterInfoBean articleLetterInfoBean = gson.fromJson(resultStr,ArticleLetterInfoBean.class);
//        List<ArticleLetterInfoBean.ResultBean.MessagelistBean>datas = articleLetterInfoBean.getResult().getMessagelist();
//        ArticleLetterInfoBean.ResultBean.NewsdataBean newsdataBean = articleLetterInfoBean.getResult().getNewsdata();
        articleLetterInfoAdapter.setDatas(articleLetterInfoBean);
        Log.d("fff", "articleLetterInfoBean:----" + articleLetterInfoBean);
    }

    @Override
    public void failure() {
        Toast.makeText(context, "sss", Toast.LENGTH_SHORT).show();
    }
}
