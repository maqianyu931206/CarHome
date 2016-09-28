package com.maqianyu.carhome.ui.activity;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderInfoBean;
import com.maqianyu.carhome.ui.adapter.FinderInfoAdapter;
import com.maqianyu.carhome.ui.inteface.VolleyResult;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 16/9/28.
 */
public class FinderInfoActivity extends AbsBaseActivity {
    private TextView textViewName, textViewPrice, textViewNum;
    private ImageView imageView;
    private ListView listView;
    private FinderInfoAdapter finderInfoAdapter;

    @Override
    protected int setLayout() {
        return R.layout.finder_info_activity;
    }

    @Override
    protected void initViews() {
        View view = LayoutInflater.from(FinderInfoActivity.this).inflate(R.layout.finder_info_header,null);
        textViewName = (TextView) view.findViewById(R.id.finder_info_name_tv);
        textViewPrice = (TextView) view.findViewById(R.id.finder_info_price_tv);
        textViewNum = (TextView) view.findViewById(R.id.finder_info_photoNum_tv);
        imageView = (ImageView) view.findViewById(R.id.finder_info_img);
        listView = byView(R.id.finder_info_listView);
        finderInfoAdapter = new FinderInfoAdapter(this);
        listView.setAdapter(finderInfoAdapter);
        listView.addHeaderView(view);
    }


    @Override
    protected void initDatas() {
        Intent intent = getIntent();
        VolleyInstance.getInstance().startRequest(NetUrl.FINDER_INFO_START + intent.getStringExtra("id") + NetUrl.FINDER_INFO_END, new VolleyResult() {
            @Override
            public void success(String resultStr) {
                Gson gson = new Gson();
                FinderInfoBean bean = gson.fromJson(resultStr, FinderInfoBean.class);
                List<FinderInfoBean.ResultBean.EnginelistBean.SpeclistBean> data = bean.getResult().getEnginelist().get(0).getSpeclist();

                finderInfoAdapter.setDatas(data);
                textViewName.setText(bean.getResult().getName());
                textViewNum.setText("共" + bean.getResult().getPiccount() + "张图片");
                textViewPrice.setText(bean.getResult().getFctprice());
                Picasso.with(FinderInfoActivity.this).load(bean.getResult().getLogo()).into(imageView);
            }
            @Override
            public void failure() {
            }
        });
    }
}
