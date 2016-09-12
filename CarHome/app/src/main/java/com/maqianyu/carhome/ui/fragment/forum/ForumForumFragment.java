package com.maqianyu.carhome.ui.fragment.forum;

import android.os.Bundle;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/9.
 */
public class ForumForumFragment extends AbsBaseFragment {
    private  String url;
    public static ForumForumFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
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

    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url = bundle.getString("url");
    }
}
