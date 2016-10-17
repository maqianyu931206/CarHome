package com.maqianyu.carhome.ui.fragment.my;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.activity.LoginActivity;
import com.maqianyu.carhome.ui.activity.MySetActivity;
import com.maqianyu.carhome.ui.activity.SaveActivity;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.PlatformDb;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.tencent.qq.QQ;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by dllo on 16/9/9.
 * 我-Fragment
 */
public class MyFragment extends AbsBaseFragment {
    private TextView login;
    private LinearLayout linearLayoutSave, set;
    private TextView qqlogin;
    private ImageView imgqqlogin;
    private CircleImageView userimg;

    public static MyFragment newInstance() {
        Bundle args = new Bundle();
        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int setLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initViews() {
        qqlogin = byView(R.id.qq_login);
        imgqqlogin = byView(R.id.img2);
        login = byView(R.id.login);
        linearLayoutSave = byView(R.id.my_save);
        set = byView(R.id.set);
        userimg =byView(R.id.img_touxiang);
    }


    @Override
    protected void initData() {
        linearLayoutSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("login", Context.MODE_PRIVATE);
                String s = sharedPreferences.getString("name", "默认");
                if (!s.isEmpty()) {
                    goTo(SaveActivity.class);

                } else {
                    Intent intent = new Intent(context, LoginActivity.class);
                    startActivityForResult(intent, 100);

                }
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LoginActivity.class);
                startActivityForResult(intent, 100);
                ((Activity)context).overridePendingTransition(R.anim.msg_anim_translate_in, R.anim.msg_anim_translate_out);

            }
        });

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo(MySetActivity.class);
            }
        });
        imgqqlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 获取第三方平台
                Platform platform = ShareSDK.getPlatform(context, QQ.NAME);
                // 授权
                platform.authorize();
                platform.setPlatformActionListener(new PlatformActionListener() {
                    @Override
                    public void onComplete(Platform platform, int i, HashMap<String, Object> hashMap) {
                        Toast.makeText(context, "授权成功", Toast.LENGTH_SHORT).show();
                        PlatformDb db = platform.getDb();
                        String name =db.getUserName();
                        login.setText(name);
                        Picasso.with(context).load(db.getUserIcon()).into(userimg);
                    }

                    @Override
                    public void onError(Platform platform, int i, Throwable throwable) {
                        Toast.makeText(context, "授权失败", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onCancel(Platform platform, int i) {
                        Toast.makeText(context, "授权取消", Toast.LENGTH_SHORT).show();

                    }
                });



            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPreferences = context.getSharedPreferences("login", Context.MODE_PRIVATE);
        String s = sharedPreferences.getString("name", "请登录");
        if (s.isEmpty()) {
            login.setText("立即登录,体验更多");
        } else {
            login.setText(s);
        }
    }
}

