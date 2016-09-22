package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderBrandCarNameBean;

import java.util.List;

/**
 * Created by dllo on 16/9/18.
 */
public class FinderBrandCarNameLvAdapter extends BaseAdapter {
    private Context context;
    private List<FinderBrandCarNameBean.ResultBean.BrandlistBean> datas;
    private List<FinderBrandCarNameBean.ResultBean>datas2;
    private  int a;
    private int position;

    public FinderBrandCarNameLvAdapter(Context context) {
        this.context = context;
    }

    public FinderBrandCarNameLvAdapter(int position) {
        this.position = position;
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
    public View getView(int position, View convertView, ViewGroup parent) {
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
        return convertView;

    }

    public int indexOf(String s) {
        for (int i = 0; i < 21; i++) {
            if ( datas.get(i).getLetter().equals(s) ) {
                a = i;
            }
        }
        return a;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv;
        GridView gridView;

        public MyViewHolder(View itemView) {
            super(itemView);
            titleTv = (TextView) itemView.findViewById(R.id.item_finder_carname_tv);
            gridView = (GridView) itemView.findViewById(R.id.item_finder_carname_gridView);
        }
    }


}
