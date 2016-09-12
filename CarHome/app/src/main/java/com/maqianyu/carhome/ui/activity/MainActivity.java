package com.maqianyu.carhome.ui.activity;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TableLayout;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.article.ArticleFragment;
import com.maqianyu.carhome.ui.fragment.findercar.FinderFragment;
import com.maqianyu.carhome.ui.fragment.forum.ForumFragment;
import com.maqianyu.carhome.ui.fragment.my.MyFragment;
import com.maqianyu.carhome.ui.fragment.sale.SaleFragment;

public class MainActivity extends AbsBaseActivity {
    private FrameLayout frameLayout;
    private RadioGroup radioGroup;
    private TableLayout tableLayout;
    private Context context;
    private ViewPager viewPager;

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
        radioGroup = byView(R.id.radioGroup);
        frameLayout = byView(R.id.frameLayout);
    }

    @Override
    protected void initDatas() {
       radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup group, int checkedId) {
               FragmentManager manager = getSupportFragmentManager();
               FragmentTransaction transaction = manager.beginTransaction();
               switch (checkedId) {
                   case R.id.radio_article_btn:
                       transaction.replace(R.id.frameLayout,new ArticleFragment());
                       break;
                   case R.id.radio_forum_btn:
                       transaction.replace(R.id.frameLayout,new ForumFragment());
                       break;
                   case R.id.radio_findCar_btn:
                       transaction.replace(R.id.frameLayout,new FinderFragment());
                       break;
                   case R.id.radio_sale_btn:
                       transaction.replace(R.id.frameLayout,new SaleFragment());
                       break;
                   case R.id.radio_my_btn:
                       transaction.replace(R.id.frameLayout,new MyFragment());
                       break;
               }
               transaction.commit();
           }
       });
        radioGroup.check(R.id.radio_article_btn);

    }


}
