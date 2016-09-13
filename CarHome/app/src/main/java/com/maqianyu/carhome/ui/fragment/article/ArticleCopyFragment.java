package com.maqianyu.carhome.ui.fragment.article;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.ui.Bean.ListTypeBean;
import com.maqianyu.carhome.ui.adapter.ArticleCopyAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/12.
 */
public class ArticleCopyFragment extends AbsBaseFragment implements VolleyResult {
    private  String url3;
    private ListView listView;
    private ArticleCopyAdapter articleCopyAdapter;

    public static ArticleCopyFragment newInstance(String url3) {
        Bundle args = new Bundle();
        args.putString("url",url3);
        ArticleCopyFragment fragment = new ArticleCopyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_article_copy;
    }

    @Override
    protected void initViews() {
        listView = byView(R.id.article_copy_lv);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url3 = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url3,this);
        articleCopyAdapter  =new ArticleCopyAdapter(context);
        listView.setAdapter(articleCopyAdapter);
    }

    @Override
    public void success(String resultStr) {
        Gson gson =new Gson();
        ArticleCopyNewsBean articleCopyNewsBean = gson.fromJson(resultStr,ArticleCopyNewsBean.class);
        List<ArticleCopyNewsBean.ResultBean.NewslistBean>datas =articleCopyNewsBean.getResult().getNewslist();
        articleCopyAdapter.setDatas(datas);
    }

    @Override
    public void failure() {

    }
}
