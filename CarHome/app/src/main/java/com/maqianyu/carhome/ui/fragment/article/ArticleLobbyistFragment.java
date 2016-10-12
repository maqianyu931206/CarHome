package com.maqianyu.carhome.ui.fragment.article;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.ui.Bean.ArticleLobbyistBean;
import com.maqianyu.carhome.ui.activity.ArticleCopyInfoActivity;
import com.maqianyu.carhome.ui.adapter.ArticleCopyAdapter;
import com.maqianyu.carhome.ui.adapter.ArticleLobbyistAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/12.
 * 推荐-说客
 */
public class ArticleLobbyistFragment extends AbsBaseFragment implements VolleyResult {
    private  String urllobbyist;
    private ListView listView;
    private ArticleLobbyistAdapter articleLobbyistAdapter;

    public static ArticleLobbyistFragment newInstance(String urllobbyist) {
        Bundle args = new Bundle();
        args.putString("url",urllobbyist);
        ArticleLobbyistFragment fragment = new ArticleLobbyistFragment();
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
        urllobbyist = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(urllobbyist,this);
        articleLobbyistAdapter  =new ArticleLobbyistAdapter(context);
        listView.setAdapter(articleLobbyistAdapter);
    }

    @Override
    public void success(String resultStr) {
        Gson gson =new Gson();
        ArticleLobbyistBean articleLobbyistBean = gson.fromJson(resultStr,ArticleLobbyistBean.class);
        List<ArticleLobbyistBean.ResultBean.ListBean>datas =articleLobbyistBean.getResult().getList();
        articleLobbyistAdapter.setDatas(datas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArticleLobbyistBean.ResultBean.ListBean bean = (ArticleLobbyistBean.ResultBean.ListBean) parent.getItemAtPosition(position);
                String title =bean.getTitle();
                String middle = bean.getId() + "";
                Intent intent  =new Intent(context, ArticleCopyInfoActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("id",middle);
                startActivity(intent);
                ((Activity)context).overridePendingTransition(R.anim.msg_anim_translate_in, R.anim.msg_anim_translate_out);

            }
        });
    }

    @Override
    public void failure() {

    }
}
