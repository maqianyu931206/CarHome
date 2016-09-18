package com.maqianyu.carhome.ui.fragment.forum;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ForumForumBean;
import com.maqianyu.carhome.ui.adapter.ForumForumAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 论坛-热帖
 */
public class ForumForumFragment extends AbsBaseFragment implements VolleyResult {
    private String url;
    private ListView listView;
    private ForumForumAdapter forumForumAdapter;

    public static ForumForumFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url", url);
        ForumForumFragment fragment = new ForumForumFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_forum_forum;
    }

    @Override
    protected void initViews() {
        listView = byView(R.id.forum_forum_listview);
        forumForumAdapter = new ForumForumAdapter(context);
        listView.setAdapter(forumForumAdapter);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url, this);
    }

    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        ForumForumBean bean = gson.fromJson(resultStr, ForumForumBean.class);
        List<ForumForumBean.ResultBean.ListBean> datas = bean.getResult().getList();
        forumForumAdapter.setDatas(datas);
    }

    @Override
    public void failure() {

    }
}
