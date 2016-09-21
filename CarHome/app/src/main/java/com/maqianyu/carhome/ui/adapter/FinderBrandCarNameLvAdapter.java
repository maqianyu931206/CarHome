package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandCarNameBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.maqianyu.carhome.utils.Contact;
import com.maqianyu.carhome.utils.ContactComparator;
import com.maqianyu.carhome.utils.ScressSizeUtil;
import com.maqianyu.carhome.utils.Utils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by dllo on 16/9/18.
 */
public class FinderBrandCarNameLvAdapter extends BaseAdapter {
    private Context context;
    private List<FinderBrandCarNameBean.ResultBean.BrandlistBean> datas;

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
