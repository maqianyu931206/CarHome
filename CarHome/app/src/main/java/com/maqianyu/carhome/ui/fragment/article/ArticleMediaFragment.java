package com.maqianyu.carhome.ui.fragment.article;

import android.os.Bundle;
import android.widget.ListView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

/**
 * Created by dllo on 16/9/12.
 * 推荐-视频
 */
public class ArticleMediaFragment extends AbsBaseFragment implements VolleyResult {
    private  String url2;
    private ListView listView;

    public static ArticleMediaFragment newInstance(String url2) {
        Bundle args = new Bundle();
        args.putString("url",url2);
        ArticleMediaFragment fragment = new ArticleMediaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragmnet_article_media;
    }

    @Override
    protected void initViews() {
        listView = byView(R.id.article_media_lv);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url2 = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url2,this);
    }

    @Override
    public void success(String resultStr) {

    }

    @Override
    public void failure() {

    }
}
