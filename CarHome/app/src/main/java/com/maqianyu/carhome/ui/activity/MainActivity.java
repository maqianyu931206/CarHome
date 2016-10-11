package com.maqianyu.carhome.ui.activity;

import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.article.ArticleFragment;
import com.maqianyu.carhome.ui.fragment.findercar.FinderFragment;
import com.maqianyu.carhome.ui.fragment.forum.ForumFragment;
import com.maqianyu.carhome.ui.fragment.my.MyFragment;
import com.maqianyu.carhome.ui.fragment.sale.SaleFragment;
import com.maqianyu.carhome.utils.T;

public class MainActivity extends AbsBaseActivity {
    private FrameLayout frameLayout;
    private RadioGroup radioGroup;
    private long exitTime = 0;


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
                        transaction.replace(R.id.frameLayout, ArticleFragment.newInstance());
                        break;
                    case R.id.radio_forum_btn:
                        transaction.replace(R.id.frameLayout, ForumFragment.newInstance());
                        break;
                    case R.id.radio_findCar_btn:
                        transaction.replace(R.id.frameLayout, FinderFragment.newInstance());
                        break;
                    case R.id.radio_sale_btn:
                        transaction.replace(R.id.frameLayout, SaleFragment.newInstance());
                        break;
                    case R.id.radio_my_btn:
                        transaction.replace(R.id.frameLayout, MyFragment.newInstance());
                        break;
                }
                transaction.commit();
            }
        });
        radioGroup.check(R.id.radio_article_btn);

    }

    /**
     * 物理返回键按俩下退出
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void exit() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            T.shortMag("再按一次退出礼物说");
            exitTime = System.currentTimeMillis();
        } else {
            finish();
            System.exit(0);
        }
    }
}
