package com.maqianyu.carhome.ui.activity;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.db.Bean;
import com.maqianyu.carhome.ui.Bean.EventBusBean;

import org.greenrobot.eventbus.EventBus;

public class LoginActivity extends AbsBaseActivity {

    private ImageView imageViewback;
    private EditText editText,editTextword;
    private  String stname,stpassword;
    private TextView textViewlogin;

    @Override
    protected int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initViews() {
        imageViewback = byView(R.id.my_login_back_img);
        editText = byView(R.id.my_login_et1);
        editTextword = byView(R.id.my_login_etpassword);
        textViewlogin  =byView(R.id.login_tv);
    }

    @Override
    protected void initDatas() {
        imageViewback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        textViewlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stname = editText.getText().toString();
                stpassword = editTextword.getText().toString();
                SharedPreferences sp = getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor =sp.edit();
                editor.putString("name",stname);
                editor.putString("password",stpassword);
                editor.commit();

                Intent intent = new Intent();
                setResult(200,intent);
                SharedPreferences sharedPreferences = getSharedPreferences("login", Context.MODE_PRIVATE);
                String s = sharedPreferences.getString("name","默认");
                intent.putExtra("111",s);
                finish();
            }
        });




    }
}
