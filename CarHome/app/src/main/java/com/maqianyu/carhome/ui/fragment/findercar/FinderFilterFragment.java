package com.maqianyu.carhome.ui.fragment.findercar;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderchioceBean;
import com.maqianyu.carhome.ui.adapter.FinderFilterAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.List;

/**
 * Created by dllo on 16/9/10.
 * 找车-筛选
 */
public class FinderFilterFragment extends AbsBaseFragment implements VolleyResult{
    private  String url;
    private FinderFilterAdapter finderFilterAdapter;
    private ListView listView;

    public static FinderFilterFragment newInstance(String url) {
        Bundle args = new Bundle();
        args.putString("url",url);
        FinderFilterFragment fragment = new FinderFilterFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    protected int setLayout() {
        return R.layout.fragment_findcar_filter;
    }
    @Override
    protected void initViews() {
        listView = byView(R.id.finder_chiose_listView);
        finderFilterAdapter = new FinderFilterAdapter(context);
        listView.setAdapter(finderFilterAdapter);
    }
    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url= bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url,this);
    }

    @Override
    public void success(String resultStr) {
        Gson gson = new Gson();
        FinderchioceBean bean = gson.fromJson(resultStr,FinderchioceBean.class);
        List<FinderchioceBean.ResultBean.SeriesBean> datas = bean.getResult().getSeries();
        finderFilterAdapter.setDatas(datas);
        Log.d("FinderFilterFragment", "datas.size():" + datas.size());
    }

    @Override
    public void failure() {

    }
}
