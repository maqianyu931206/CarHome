package com.maqianyu.carhome.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.adapter.ForumRvAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class ForumAnsleseFragment extends AbsBaseFragment {
    private RecyclerView recyclerView;
    private ForumRvAdapter forumRvAdapter;
    private  int i;
    String str[] = new String[]{"全部","媳妇当车模","美人'记'","论坛讲师","精挑细选","现身说法",
            "高端阵地","电动车","汇买车","行车点评","超级驾驶员","海外购车","经典老车","妹子选车","优惠购车","原创大片","顶配风采",
             "改装有理","养车有道","首发阵容","新车直播","历史选题","挚友天地","蜜月之旅","甜蜜婚礼","摄影课堂","车友聚会","单车部落",
            "杂谈俱乐部","华北游记","西南游记","东北游记","西北游记","华中游记","华南游记","华东游记","港澳台游记","海外游记","沧海遗珠"};

    @Override
    protected int setLayout() {
        return R.layout.fragment_forum_anslese;
    }

    @Override
    protected void initViews() {
        recyclerView = byView(R.id.forum_rv);
        forumRvAdapter  = new ForumRvAdapter(getContext());
    }

    @Override
    protected void initData() {
        recyclerView.setAdapter(forumRvAdapter);
        LinearLayoutManager llManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(llManager);
        List<String>datas = new ArrayList<>();
        for ( i = 0; i < str.length; i++) {
            datas.add(str[i]);
        }
        forumRvAdapter.setDatas(datas);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
