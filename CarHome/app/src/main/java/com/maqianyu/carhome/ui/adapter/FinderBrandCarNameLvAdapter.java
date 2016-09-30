package com.maqianyu.carhome.ui.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.gson.Gson;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.model.net.NetUrl;
import com.maqianyu.carhome.model.net.VolleyInstance;
import com.maqianyu.carhome.ui.Bean.FinderBrandCarNameBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandDrawerBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.maqianyu.carhome.ui.activity.FinderInfoActivity;
import com.maqianyu.carhome.ui.app.MyApp;
import com.maqianyu.carhome.ui.inteface.VolleyResult;

import org.greenrobot.eventbus.EventBus;

import java.util.List;

/**
 * Created by dllo on 16/9/18.
 * 找车-A-Z的listView适配器
 */
public class FinderBrandCarNameLvAdapter extends BaseAdapter {
    private Context context;
    private List<FinderBrandCarNameBean.ResultBean.BrandlistBean> datas;
    private int a;
    private ListView listView1;
    private RadioButton radioButtonshowAd, radioButtonallAd, rbback;
    private FinderBrandDrawerAdapter finderBrandDrawerAdapter;
    private String url;


    public FinderBrandCarNameLvAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<FinderBrandCarNameBean.ResultBean.BrandlistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas == null ? null : datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_finder_carname, null);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        } else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        myViewHolder.titleTv.setText(datas.get(position).getLetter());
        FinderCarGridViewAdapter finderCarGridViewAdapter = new FinderCarGridViewAdapter(context);
        myViewHolder.gridView.setAdapter(finderCarGridViewAdapter);
        finderCarGridViewAdapter.setDatas(datas.get(position).getList());
        // gridView点击事件
        myViewHolder.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position2, long id) {
                View view1 = LayoutInflater.from(context).inflate(R.layout.drawe, null);
                RelativeLayout drawerLayout1;
                drawerLayout1 = (RelativeLayout) view1.findViewById(R.id.finder_drawerlayout2);
                listView1 = (ListView) view1.findViewById(R.id.finder_brand_drawer_listView2);
                radioButtonshowAd = (RadioButton) view1.findViewById(R.id.finder_brand_rb_show2);
                radioButtonallAd = (RadioButton) view1.findViewById(R.id.finder_brand_rb_all2);
                rbback = (RadioButton) view1.findViewById(R.id.finder_brand_rb_back);
                finderBrandDrawerAdapter = new FinderBrandDrawerAdapter(context);
                WindowManager windowManger = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
                DisplayMetrics metrics = new DisplayMetrics();
                windowManger.getDefaultDisplay().getMetrics(metrics);
                int screenWidth = metrics.widthPixels * 3 / 4;
                int screeHeight = metrics.heightPixels;
                drawerLayout1.setMinimumWidth(screenWidth);
                drawerLayout1.setMinimumHeight(screeHeight);
                final PopupWindow popupWindow = new PopupWindow(context);
                popupWindow.setWidth(screenWidth);
                popupWindow.setHeight(screeHeight);
                popupWindow.setContentView(view1);
                popupWindow.setFocusable(true);
                WindowManager.LayoutParams params2 = ((Activity) context).getWindow().getAttributes();
                params2.alpha = 0.3f;
                ((Activity) context).getWindow().setAttributes(params2);
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams params = ((Activity) context).getWindow().getAttributes();
                        params.alpha = 1f;
                        ((Activity) context).getWindow().setAttributes(params);
                    }
                });
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.showAtLocation(drawerLayout1, Gravity.LEFT, screenWidth, ViewGroup.LayoutParams.MATCH_PARENT);
                listView1.setAdapter(finderBrandDrawerAdapter);
                String middleurl = datas.get(position).getList().get(position2).getId() + "";
                final String showurl = NetUrl.FINDER_BRAND_LV_SHOW_START + middleurl + NetUrl.FINDER_BRAND_LV_SHOW_END;
                final String allurl = NetUrl.FINDER_BRAND_LV_ALL_START + middleurl + NetUrl.FINDER_BRAND_LV_ALL_END;
                url = showurl;
                radioButtonshowAd.setTextColor(Color.BLUE);
                radioButtonshowAd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked == true) {
                            url = showurl;
                            radioButtonshowAd.setTextColor(Color.BLUE);
                            radioButtonallAd.setTextColor(Color.BLACK);
                            buildlistDatas();
                        }
                    }
                });
                radioButtonallAd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked == true) {
                            url = allurl;
                            radioButtonallAd.setTextColor(Color.BLUE);
                            radioButtonshowAd.setTextColor(Color.BLACK);
                            buildlistDatas();
                        }
                    }
                });
                rbback.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        popupWindow.dismiss();
                        WindowManager.LayoutParams params = ((Activity) context).getWindow().getAttributes();
                        params.alpha = 1f;
                        ((Activity) context).getWindow().setAttributes(params);
                    }
                });

                buildlistDatas(); // 抽屉数据的加载
            }

            private void buildlistDatas() {
                VolleyInstance.getInstance().startRequest(url, new VolleyResult() {
                    @Override
                    public void success(String resultStr) {
                        Gson gson = new Gson();
                        final FinderBrandDrawerBean bean = gson.fromJson(resultStr, FinderBrandDrawerBean.class);
                        final List<FinderBrandDrawerBean.ResultBean.FctlistBean> datas = bean.getResult().getFctlist();
                        finderBrandDrawerAdapter.setDatas(datas);
                    }

                    @Override
                    public void failure() {
                    }
                });
            }
        });
        return convertView;
    }

    public int indexOf(String s) {
        for (int i = 0; i < 21; i++) {
            if (datas.get(i).getLetter().equals(s)) {
                a = i;
            }
        }
        return a;
    }

    class MyViewHolder {
        TextView titleTv;
        GridView gridView;

        public MyViewHolder(View itemView) {
            titleTv = (TextView) itemView.findViewById(R.id.item_finder_carname_tv);
            gridView = (GridView) itemView.findViewById(R.id.item_finder_carname_gridView);
        }
    }

}
