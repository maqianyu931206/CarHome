package com.maqianyu.carhome.ui.fragment.findercar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/10.
 */
public class FinderBrandFragment extends AbsBaseFragment {
    private String url;
    public static FinderBrandFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        FinderBrandFragment fragment = new FinderBrandFragment();
        fragment.setArguments(args);
        return fragment;
    }
    private LayoutInflater menuInflater;

    @Override
    protected int setLayout() {
        return R.layout.fragment_findcar_brand;
    }
    @Override
    protected void initViews() {
    }
    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url = bundle.getString("url");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        LayoutInflater.from(getContext()).inflate(R.menu.main,null);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
