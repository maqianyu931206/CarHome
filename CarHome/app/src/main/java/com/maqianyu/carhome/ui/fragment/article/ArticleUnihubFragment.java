package com.maqianyu.carhome.ui.fragment.article;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

import static com.maqianyu.carhome.R.mipmap.ahlib_arrow_gray_up;

/**
 * Created by dllo on 16/9/9.
 */
public class ArticleUnihubFragment extends AbsBaseFragment {
    private ImageView showAll;
    private View viewview;
    private TextView textViewAll;
    private TextView textView;
    private  String url;

    public static ArticleUnihubFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        ArticleUnihubFragment fragment = new ArticleUnihubFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected int setLayout() {
        return R.layout.fragment_article_unihub;
    }

    @Override
    protected void initViews() {
        showAll = byView(R.id.article_uniHub_show_all);
        textViewAll = byView(R.id.article_all_tv);
        textView = byView(R.id.article_tv_wwww);
        viewview = byView(R.id.view);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url = bundle.getString("url");

        textView.setText(url);
        PopUnihub();// 点击弹出popWindow,选择全部,优选,我的关注
    }


    private void PopUnihub() {
        textViewAll.setText("优选");
        showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(getContext()).inflate(R.layout.article_pop_unihub, null);
                LinearLayout linearLayout;
                final TextView qbtv, wdgztv, yxtv;
                final ImageView selectetrue1,selectetrue2,selectetrue3;
                selectetrue1 = (ImageView) view.findViewById(R.id.select_true1);
                selectetrue2 = (ImageView) view.findViewById(R.id.select_true2);
                selectetrue3 = (ImageView) view.findViewById(R.id.select_true3);
                linearLayout = (LinearLayout) view.findViewById(R.id.article_unihub_pop_linearLayout);
                qbtv = (TextView) view.findViewById(R.id.qbTv);
                wdgztv = (TextView) view.findViewById(R.id.wdgzTv);
                yxtv = (TextView) view.findViewById(R.id.yxTv);
                final PopupWindow popupWindow = new PopupWindow(linearLayout, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setContentView(view);
                popupWindow.setFocusable(true);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                       showAll.setImageResource(R.mipmap.ahlib_arrow_gray_down);
                    }
                });
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.showAsDropDown(viewview);
                showAll.setImageResource(R.mipmap.ahlib_arrow_gray_up);

                yxtv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        qbtv.setTextColor(Color.BLACK);
                        yxtv.setTextColor(Color.BLUE);
                        wdgztv.setTextColor(Color.BLACK);
                        textViewAll.setText("优选");
                        selectetrue1.setVisibility(View.VISIBLE);
                        selectetrue2.setVisibility(View.GONE);
                        selectetrue3.setVisibility(View.GONE);
                    }
                });
                qbtv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        qbtv.setTextColor(Color.BLUE);
                        yxtv.setTextColor(Color.BLACK);
                        wdgztv.setTextColor(Color.BLACK);
                        textViewAll.setText("全部");
                        selectetrue2.setVisibility(View.VISIBLE);
                        selectetrue1.setVisibility(View.GONE);
                        selectetrue3.setVisibility(View.GONE);
                    }
                });
                wdgztv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        qbtv.setTextColor(Color.BLACK);
                        yxtv.setTextColor(Color.BLACK);
                        wdgztv.setTextColor(Color.BLUE);
                        textViewAll.setText("我的关注");
                        selectetrue3.setVisibility(View.VISIBLE);
                        selectetrue1.setVisibility(View.GONE);
                        selectetrue2.setVisibility(View.GONE);
                    }
                });

                if (textViewAll.getText().equals("全部")) {
                    qbtv.setTextColor(Color.BLUE);
                    selectetrue1.setVisibility(View.GONE);
                    selectetrue3.setVisibility(View.GONE);
                    selectetrue2.setVisibility(View.VISIBLE);
                }
                else if (textViewAll.getText().equals("优选")) {
                    yxtv.setTextColor(Color.BLUE);
                    selectetrue1.setVisibility(View.VISIBLE);
                    selectetrue2.setVisibility(View.GONE);
                    selectetrue3.setVisibility(View.GONE);
                }
                else if (textViewAll.getText().equals("我的关注")) {
                    wdgztv.setTextColor(Color.BLUE);
                    selectetrue1.setVisibility(View.GONE);
                    selectetrue2.setVisibility(View.GONE);
                    selectetrue3.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
