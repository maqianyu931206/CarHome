package com.maqianyu.carhome.ui.fragment.article;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleMediaBean;
import com.maqianyu.carhome.ui.activity.ArticleMediaActivity;
import com.maqianyu.carhome.ui.adapter.ArticleMediaAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;
import java.util.List;

/**
 * Created by dllo on 16/9/12.
 * 推荐-视频
 */
public class ArticleMediaFragment extends AbsBaseFragment implements VolleyResult {
    private  String urlmedia;
    private ListView listView;
    private ArticleMediaAdapter articleMediaAdapter;

    public static ArticleMediaFragment newInstance(String urlmedia) {
        Bundle args = new Bundle();
        args.putString("url",urlmedia);
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
        articleMediaAdapter = new ArticleMediaAdapter(context);
        listView.setAdapter(articleMediaAdapter);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        urlmedia = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(urlmedia,this);
    }

    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        final ArticleMediaBean bean = gson.fromJson(resultStr, ArticleMediaBean.class);
        List<ArticleMediaBean.ResultBean.ListBean> datas = bean.getResult().getList();
        articleMediaAdapter.setDatas(datas);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent  = new Intent(context, ArticleMediaActivity.class);
                String strid = bean.getResult().getList().get(position).getId() + "";
                intent.putExtra("id",strid);
                startActivity(intent);

            }
        });
    }

    @Override
    public void failure() {

    }
}
