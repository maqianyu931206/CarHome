package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderBrandDrawerBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/19.
 */
public class FinderBrandDrawerAdapter extends BaseAdapter {

    List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean>datas;
    private Context context;

    public FinderBrandDrawerAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean> datas) {
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
        if (convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_finder_drawer,null);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        myViewHolder.nametv.setText(datas.get(position).getName());
        myViewHolder.pricetv.setText(datas.get(position).getPrice());
        Picasso.with(context).load(datas.get(position).getImgurl()).resize(200,150).into(myViewHolder.img);
        return convertView;
    }

    class  MyViewHolder {
        TextView nametv,pricetv;
        ImageView img;

        public  MyViewHolder(View view){
            nametv = (TextView) view.findViewById(R.id.item_finder_drawer_nametv);
            pricetv = (TextView) view.findViewById(R.id.item_finder_drawer_pricetv);
            img = (ImageView) view.findViewById(R.id.item_finder_drawer_img);
        }
    }

}
