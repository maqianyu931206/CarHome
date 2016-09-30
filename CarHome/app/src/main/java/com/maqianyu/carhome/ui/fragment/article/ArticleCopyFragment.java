package com.maqianyu.carhome.ui.fragment.article;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.ui.activity.ArticleCopyInfoActivity;
import com.maqianyu.carhome.ui.adapter.ArticleCopyAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;
import java.util.List;

/**
 * Created by dllo on 16/9/12.
 * 推荐-复用的
 */
public class ArticleCopyFragment extends AbsBaseFragment implements VolleyResult {
    private  String urlcopy;
    private ListView listView;
    private ArticleCopyAdapter articleCopyAdapter;

    public static ArticleCopyFragment newInstance(String urlcopy) {
        Bundle args = new Bundle();
        args.putString("url",urlcopy);
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
        urlcopy = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(urlcopy,this);
        articleCopyAdapter  =new ArticleCopyAdapter(context);
        listView.setAdapter(articleCopyAdapter);
    }

    @Override
    public void success(String resultStr) {
        Gson gson =new Gson();
        ArticleCopyNewsBean articleCopyNewsBean = gson.fromJson(resultStr,ArticleCopyNewsBean.class);
        List<ArticleCopyNewsBean.ResultBean.NewslistBean>datas =articleCopyNewsBean.getResult().getNewslist();
        articleCopyAdapter.setDatas(datas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ArticleCopyNewsBean.ResultBean.NewslistBean  bean = (ArticleCopyNewsBean.ResultBean.NewslistBean) parent.getItemAtPosition(position);
                String title =bean.getTitle();
                String middle = bean.getId() + "";
                Intent intent  =new Intent(context, ArticleCopyInfoActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("id",middle);
                startActivity(intent);
            }
        });
    }
    @Override
    public void failure() {

    }
}
