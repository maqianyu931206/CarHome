package com.maqianyu.carhome.ui.fragment.forum;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ForumLVBean;
import com.maqianyu.carhome.ui.adapter.ForumLVAdapter;
import com.maqianyu.carhome.ui.adapter.ForumRvAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.ForumIntance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class ForumAnsleseFragment extends AbsBaseFragment {
    private RecyclerView recyclerView;
    private ForumRvAdapter forumRvAdapter;
    private ForumLVAdapter forumLVAdapter;
    private ImageView forumIntentImg;
    private  List<ForumLVBean>datas;
    private  int i;
    String str[] = new String[]{"全部","媳妇当车模","美人'记'","论坛讲师","精挑细选","现身说法",
            "高端阵地","电动车","汇买车","行车点评","超级驾驶员","海外购车","经典老车","妹子选车","优惠购车","原创大片","顶配风采",
             "改装有理","养车有道","首发阵容","新车直播","历史选题","挚友天地","蜜月之旅","甜蜜婚礼","摄影课堂","车友聚会","单车部落",
            "杂谈俱乐部","华北游记","西南游记","东北游记","西北游记","华中游记","华南游记","华东游记","港澳台游记","海外游记","沧海遗珠"};

    private  String url;
    public static ForumAnsleseFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        ForumAnsleseFragment fragment = new ForumAnsleseFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    protected int setLayout() {

        return R.layout.fragment_forum_anslese;
    }
    @Override
    protected void initViews() {
        recyclerView = byView(R.id.forum_rv);
        forumIntentImg = byView(R.id.forum_intent_img);
        forumRvAdapter  = new ForumRvAdapter(getContext());
        forumLVAdapter = new ForumLVAdapter(getContext());
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
        // 行布局你点击事件
        forumRvAdapter.setForumIntance(new ForumIntance() {
            @Override
            public void ForumItemListener(int position, Object o) {
                Log.d("aaa", "点击了" + position + " hang");
                Log.d("aaa", "o:" + o);
            }
        });
        Bundle bundle = getArguments();
        url =bundle.getString("url");


        Imgintent();// 弹出PopWindow
    }


    private void Imgintent() {
        forumIntentImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("sss", "sss");
                View view  = LayoutInflater.from(getContext()).inflate(R.layout.forum_pop_anslese,null);
                RelativeLayout relativeLayout;
                TextView textView;
                ListView listView;
                listView  = (ListView) view.findViewById(R.id.forum_pop_listView);
                relativeLayout= (RelativeLayout) view.findViewById(R.id.forum_pop_rellay);
                textView  = (TextView) view.findViewById(R.id.back);
                WindowManager windowManger = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
                DisplayMetrics metrics = new DisplayMetrics();
                windowManger.getDefaultDisplay().getMetrics(metrics);
                int screenWidth = metrics.widthPixels *3 / 4;
                int screeHeight = metrics.heightPixels ;
                Log.d("ForumAnsleseFragment", "sss:" + screeHeight);
                relativeLayout.setMinimumWidth(screenWidth);
                relativeLayout.setMinimumHeight(screeHeight);
                final PopupWindow pw = new PopupWindow(relativeLayout,screenWidth,screeHeight);
                pw.setContentView(view);
                pw.setFocusable(true);
                pw.setBackgroundDrawable(new ColorDrawable(0));
                pw.showAtLocation(relativeLayout, Gravity.LEFT,screenWidth,screeHeight);
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        pw.dismiss();
                    }
                });
                buildDatas();
                forumLVAdapter.setDatas(datas);
                listView.setAdapter(forumLVAdapter);
            }
            private void buildDatas() {
                datas =new ArrayList<>();
                for ( i = 0; i < str.length; i++) {
                    datas.add(new ForumLVBean(str[i]));
                }
            }
        });
    }


}
