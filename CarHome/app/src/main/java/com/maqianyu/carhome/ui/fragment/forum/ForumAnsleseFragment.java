package com.maqianyu.carhome.ui.fragment.forum;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.ForumAnsleseBean;
import com.maqianyu.carhome.ui.activity.ForumAnlseseActivity;
import com.maqianyu.carhome.ui.adapter.ForumAnsleseAdpater;
import com.maqianyu.carhome.ui.adapter.ForumRvAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/9.
 * 论坛-精选推荐
 */
public class ForumAnsleseFragment extends AbsBaseFragment implements VolleyResult {
    private RecyclerView recyclerView;
    private ForumRvAdapter forumRvAdapter;
    private ImageView forumIntentImg;
    private ForumAnsleseAdpater forumAnsleseAdpater;
    private ListView listView;
    private int i;
    String str[] = new String[]{"全部", "媳妇当车模", "美人'记'", "论坛名人馆", "论坛讲师", "汽车之家十年", "精挑细选", "现身说法",
            "高端阵地", "电动车", "汇买车", "行车点评", "超级驾驶员", "海外购车", "经典老车", "妹子选车", "优惠购车", "原创大片", "顶配风采",
            "改装有理", "养车有道", "首发阵容", "新车直播", "历史选题", "挚友天地", "蜜月之旅", "甜蜜婚礼", "摄影课堂", "车友聚会", "单车部落",
            "杂谈俱乐部", "华北游记", "西南游记", "东北游记", "西北游记", "华中游记", "华南游记", "华东游记", "港澳台游记", "海外游记", "沧海遗珠"};

    private String url;
    public static ForumAnsleseFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url", url);
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
        listView = byView(R.id.forum_anslese_listview);
        forumRvAdapter = new ForumRvAdapter(getContext());
        forumAnsleseAdpater = new ForumAnsleseAdpater(context);
        listView.setAdapter(forumAnsleseAdpater);
    }

    @Override
    protected void initData() {
        recyclerView.setAdapter(forumRvAdapter);
        LinearLayoutManager llManager = new LinearLayoutManager(context);
        llManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(llManager);
        List<String> datas = new ArrayList<>();
        for (i = 0; i < str.length; i++) {
            datas.add(str[i]);
        }
        forumRvAdapter.setDatas(datas);
        Bundle bundle = getArguments();
        url = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url, this);
        reviewclick();// 行布局你点击事件
        Imgintent();// 弹出PopWindow
    }


    private void Imgintent() {
        forumIntentImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(getContext()).inflate(R.layout.forum_pop_anslese, null);
                RelativeLayout relativeLayout;
                TextView textView;
                // 竖向的recyclerView
                final RecyclerView recyclerView1;
                recyclerView1 = (RecyclerView) view.findViewById(R.id.forum_pop_listView);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
                recyclerView1.setLayoutManager(linearLayoutManager);
                relativeLayout = (RelativeLayout) view.findViewById(R.id.forum_pop_rellay);
                textView = (TextView) view.findViewById(R.id.back);
                WindowManager windowManger = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
                DisplayMetrics metrics = new DisplayMetrics();
                windowManger.getDefaultDisplay().getMetrics(metrics);
                int screenWidth = metrics.widthPixels * 3 / 4;
                int screeHeight = metrics.heightPixels;
                relativeLayout.setMinimumWidth(screenWidth);
                relativeLayout.setMinimumHeight(screeHeight);
                final PopupWindow pw = new PopupWindow(getContext());
                pw.setWidth(screenWidth);
                pw.setHeight(screeHeight);
                pw.setContentView(view);
                pw.setFocusable(true);
                pw.setBackgroundDrawable(new ColorDrawable(0));
                pw.showAtLocation(relativeLayout, Gravity.CENTER_VERTICAL, screenWidth, screeHeight);
                WindowManager.LayoutParams params = getActivity().getWindow().getAttributes();
                params.alpha = 0.3f;
                getActivity().getWindow().setAttributes(params);
                pw.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams params2 = getActivity().getWindow().getAttributes();
                        params2.alpha = 1f;
                        getActivity().getWindow().setAttributes(params2);
                    }
                });
                List<String> datas = new ArrayList<>();
                for (i = 0; i < str.length; i++) {
                    datas.add(str[i]);
                }
                forumRvAdapter.setDatas(datas);

                //点击事件
                forumRvAdapter.setForumIntance(new ForumIntance() {
                    @Override
                    public void ForumItemListener(int position2, Object o) {
                        recyclerView.smoothScrollToPosition(position2);
                        recyclerView1.smoothScrollToPosition(position2);
                        WindowManager.LayoutParams params = getActivity().getWindow().getAttributes();
                        params.alpha = 1f;
                        getActivity().getWindow().setAttributes(params);
                        switch (position2) {
                            case 0:
                                url = NetUrl.FORUM_ANSLESE_0;
                                break;
                            case 1:
                                url = NetUrl.FORUM_ANSLESE_1;
                                break;
                            case 2:
                                url = NetUrl.FORUM_ANSLESE_2;
                                break;
                            case 3:
                                url = NetUrl.FORUM_ANSLESE_3;
                                break;
                            case 4:
                                url = NetUrl.FORUM_ANSLESE_4;
                                break;
                            case 5:
                                url = NetUrl.FORUM_ANSLESE_5;
                                break;
                            case 6:
                                url = NetUrl.FORUM_ANSLESE_6;
                                break;
                            case 7:
                                url = NetUrl.FORUM_ANSLESE_7;
                                break;
                            case 8:
                                url = NetUrl.FORUM_ANSLESE_8;
                                break;
                            case 9:
                                url = NetUrl.FORUM_ANSLESE_9;
                                break;
                            case 10:
                                url = NetUrl.FORUM_ANSLESE_10;
                                break;
                            case 11:
                                url = NetUrl.FORUM_ANSLESE_11;
                                break;
                            case 12:
                                url = NetUrl.FORUM_ANSLESE_12;
                                break;
                            case 13:
                                url = NetUrl.FORUM_ANSLESE_13;
                                break;
                            case 14:
                                url = NetUrl.FORUM_ANSLESE_14;
                                break;
                            case 15:
                                url = NetUrl.FORUM_ANSLESE_15;
                                break;
                            case 16:
                                url = NetUrl.FORUM_ANSLESE_16;
                                break;
                            case 17:
                                url = NetUrl.FORUM_ANSLESE_17;
                                break;
                            case 18:
                                url = NetUrl.FORUM_ANSLESE_18;
                                break;
                            case 19:
                                url = NetUrl.FORUM_ANSLESE_19;
                                break;
                            case 20:
                                url = NetUrl.FORUM_ANSLESE_20;
                                break;
                            case 21:
                                url = NetUrl.FORUM_ANSLESE_21;
                                break;
                            case 22:
                                url = NetUrl.FORUM_ANSLESE_22;
                                break;
                            case 23:
                                url = NetUrl.FORUM_ANSLESE_23;
                                break;
                            case 24:
                                url = NetUrl.FORUM_ANSLESE_24;
                                break;
                            case 25:
                                url = NetUrl.FORUM_ANSLESE_25;
                                break;
                            case 26:
                                url = NetUrl.FORUM_ANSLESE_26;
                                break;
                            case 27:
                                url = NetUrl.FORUM_ANSLESE_27;
                                break;
                            case 28:
                                url = NetUrl.FORUM_ANSLESE_28;
                                break;
                            case 29:
                                url = NetUrl.FORUM_ANSLESE_29;
                                break;
                            case 30:
                                url = NetUrl.FORUM_ANSLESE_30;
                                break;
                            case 31:
                                url = NetUrl.FORUM_ANSLESE_31;
                                break;
                            case 32:
                                url = NetUrl.FORUM_ANSLESE_32;
                                break;
                            case 33:
                                url = NetUrl.FORUM_ANSLESE_33;
                                break;
                            case 34:
                                url = NetUrl.FORUM_ANSLESE_34;
                                break;
                            case 35:
                                url = NetUrl.FORUM_ANSLESE_35;
                                break;
                            case 36:
                                url = NetUrl.FORUM_ANSLESE_36;
                                break;
                            case 37:
                                url = NetUrl.FORUM_ANSLESE_37;
                                break;
                            case 38:
                                url = NetUrl.FORUM_ANSLESE_38;
                                break;
                            case 39:
                                url = NetUrl.FORUM_ANSLESE_39;
                                break;
                            case 40:
                                url = NetUrl.FORUM_ANSLESE_40;
                                break;
                        }
                        VolleyInstance.getInstance().startRequest(url, ForumAnsleseFragment.this);
                        pw.dismiss();
                    }
                });
                recyclerView1.setAdapter(forumRvAdapter);
                // 返回按钮
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        WindowManager.LayoutParams params2 = getActivity().getWindow().getAttributes();
                        params2.alpha = 1f;
                        getActivity().getWindow().setAttributes(params2);
                        pw.dismiss();
                    }
                });
            }
        });

    }

    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        final ForumAnsleseBean bean = gson.fromJson(resultStr, ForumAnsleseBean.class);
        List<ForumAnsleseBean.ResultBean.ListBean> datas = bean.getResult().getList();
        forumAnsleseAdpater.setDatas(datas);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(context, ForumAnlseseActivity.class);
                String strid = bean.getResult().getList().get(position).getTopicid() + "";
                intent.putExtra("id", strid);
                startActivity(intent);

            }
        });
    }

    @Override
    public void failure() {
    }

    public void reviewclick() {
        forumRvAdapter.setForumIntance(new ForumIntance() {
            @Override
            public void ForumItemListener(int position, Object o) {
                switch (position) {
                    case 0:
                        url = NetUrl.FORUM_ANSLESE_0;
                        break;
                    case 1:
                        url = NetUrl.FORUM_ANSLESE_1;
                        break;
                    case 2:
                        url = NetUrl.FORUM_ANSLESE_2;
                        break;
                    case 3:
                        url = NetUrl.FORUM_ANSLESE_3;
                        break;
                    case 4:
                        url = NetUrl.FORUM_ANSLESE_4;
                        break;
                    case 5:
                        url = NetUrl.FORUM_ANSLESE_5;
                        break;
                    case 6:
                        url = NetUrl.FORUM_ANSLESE_6;
                        break;
                    case 7:
                        url = NetUrl.FORUM_ANSLESE_7;
                        break;
                    case 8:
                        url = NetUrl.FORUM_ANSLESE_8;
                        break;
                    case 9:
                        url = NetUrl.FORUM_ANSLESE_9;
                        break;
                    case 10:
                        url = NetUrl.FORUM_ANSLESE_10;
                        break;
                    case 11:
                        url = NetUrl.FORUM_ANSLESE_11;
                        break;
                    case 12:
                        url = NetUrl.FORUM_ANSLESE_12;
                        break;
                    case 13:
                        url = NetUrl.FORUM_ANSLESE_13;
                        break;
                    case 14:
                        url = NetUrl.FORUM_ANSLESE_14;
                        break;
                    case 15:
                        url = NetUrl.FORUM_ANSLESE_15;
                        break;
                    case 16:
                        url = NetUrl.FORUM_ANSLESE_16;
                        break;
                    case 17:
                        url = NetUrl.FORUM_ANSLESE_17;
                        break;
                    case 18:
                        url = NetUrl.FORUM_ANSLESE_18;
                        break;
                    case 19:
                        url = NetUrl.FORUM_ANSLESE_19;
                        break;
                    case 20:
                        url = NetUrl.FORUM_ANSLESE_20;
                        break;
                    case 21:
                        url = NetUrl.FORUM_ANSLESE_21;
                        break;
                    case 22:
                        url = NetUrl.FORUM_ANSLESE_22;
                        break;
                    case 23:
                        url = NetUrl.FORUM_ANSLESE_23;
                        break;
                    case 24:
                        url = NetUrl.FORUM_ANSLESE_24;
                        break;
                    case 25:
                        url = NetUrl.FORUM_ANSLESE_25;
                        break;
                    case 26:
                        url = NetUrl.FORUM_ANSLESE_26;
                        break;
                    case 27:
                        url = NetUrl.FORUM_ANSLESE_27;
                        break;
                    case 28:
                        url = NetUrl.FORUM_ANSLESE_28;
                        break;
                    case 29:
                        url = NetUrl.FORUM_ANSLESE_29;
                        break;
                    case 30:
                        url = NetUrl.FORUM_ANSLESE_30;
                        break;
                    case 31:
                        url = NetUrl.FORUM_ANSLESE_31;
                        break;
                    case 32:
                        url = NetUrl.FORUM_ANSLESE_32;
                        break;
                    case 33:
                        url = NetUrl.FORUM_ANSLESE_33;
                        break;
                    case 34:
                        url = NetUrl.FORUM_ANSLESE_34;
                        break;
                    case 35:
                        url = NetUrl.FORUM_ANSLESE_35;
                        break;
                    case 36:
                        url = NetUrl.FORUM_ANSLESE_36;
                        break;
                    case 37:
                        url = NetUrl.FORUM_ANSLESE_37;
                        break;
                    case 38:
                        url = NetUrl.FORUM_ANSLESE_38;
                        break;
                    case 39:
                        url = NetUrl.FORUM_ANSLESE_39;
                        break;
                    case 40:
                        url = NetUrl.FORUM_ANSLESE_40;
                        break;
                }
                VolleyInstance.getInstance().startRequest(url, ForumAnsleseFragment.this);
            }
        });
    }
}
