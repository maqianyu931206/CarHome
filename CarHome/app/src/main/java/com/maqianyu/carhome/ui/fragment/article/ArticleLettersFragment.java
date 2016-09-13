package com.maqianyu.carhome.ui.fragment.article;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleLettersBean;
import com.maqianyu.carhome.ui.adapter.ArticleLetterAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/12.
 */
public class ArticleLettersFragment extends AbsBaseFragment implements VolleyResult {
   private  String url1;
    private ArticleLetterAdapter articleLetterAdapter;
private ListView listView;
    public static ArticleLettersFragment newInstance(String url1) {
        Bundle args = new Bundle();
        args.putString("url",url1);
        ArticleLettersFragment fragment = new ArticleLettersFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_article_letters;
    }

    @Override
    protected void initViews() {
        articleLetterAdapter  = new ArticleLetterAdapter(context);
        listView = byView(R.id.article_letters_lv);
        listView.setAdapter(articleLetterAdapter);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url1 = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url1,this);
    }

    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        ArticleLettersBean articleLettersBean = gson.fromJson(resultStr,ArticleLettersBean.class);
        List<ArticleLettersBean.ResultBean.ListBean>datas = articleLettersBean.getResult().getList();
        articleLetterAdapter.setDatas(datas);
        Log.d("aaaaaee", "datas.size():" + datas.size());
    }

    @Override
    public void failure() {

    }
}
