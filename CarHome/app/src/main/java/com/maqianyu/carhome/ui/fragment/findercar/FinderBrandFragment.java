package com.maqianyu.carhome.ui.fragment.findercar;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.ListView;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderBrandBean;
//import com.maqianyu.carhome.ui.adapter.FinderBrandAdapter;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by dllo on 16/9/10.
 * 找车-品牌
 */
public class FinderBrandFragment extends AbsBaseFragment implements VolleyResult{
    private String url;
////    private FinderBrandAdapter finderBrandAdapter;
//    private List<FinderBrandBean.ResultBean.BrandlistBean>groupData = new ArrayList<>();
//    private List<FinderBrandBean.ResultBean.BrandlistBean>childDatas= new ArrayList<>();
//    private List<List<FinderBrandBean.ResultBean.BrandlistBean>>groupList = new ArrayList<>();
    private ExpandableListView expandableListView;
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
//        finderBrandAdapter  =new FinderBrandAdapter(context);
        expandableListView =byView(R.id.finder_brand_exlistview);
//        expandableListView.setAdapter(finderBrandAdapter);

    }
    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        url = bundle.getString("url");
        VolleyInstance.getInstance().startRequest(url,this);
//        initExData();
//    }

//    private void initExData() {
//       groupData.add("A");
//       groupData.add("B");
//       groupData.add("C");
//        for (int i = 0; i < 21; i++) {
//            childDatas.add("A" + i);
//        }
//
    }

    @Override
    public void success(String resultStr) {
        Gson gson =new Gson();
        FinderBrandBean bean = gson.fromJson(resultStr,FinderBrandBean.class);
        List<FinderBrandBean.ResultBean.BrandlistBean> datas = bean.getResult().getBrandlist();
//        groupList.add(datas);
//        finderBrandAdapter.setGroup_list(groupList);
//        finderBrandAdapter.setGroupDatas(groupData);

    }

    @Override
    public void failure() {

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

    private class ChildItem {
    }
}
