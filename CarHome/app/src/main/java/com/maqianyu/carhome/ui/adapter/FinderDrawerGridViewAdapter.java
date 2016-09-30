package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderBrandDrawerBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/22.
 */
public class FinderDrawerGridViewAdapter extends BaseAdapter {
    List<FinderBrandDrawerBean.ResultBean.FctlistBean.SerieslistBean>datas;
    private Context context;


    public FinderDrawerGridViewAdapter(Context context) {
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
        ViewHolder viewHolder ;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_finder_drawer,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.pricetv.setText(datas.get(position).getPrice());
        viewHolder.nameTv.setText(datas.get(position).getName());
        Picasso.with(context).load(datas.get(position).getImgurl()).resize(200,160).into(viewHolder.img);
        return convertView;
    }
    class  ViewHolder{
        TextView nameTv,pricetv;
        ImageView img;
        public  ViewHolder(View v){
            nameTv = (TextView) v.findViewById(R.id.item_finder_drawer_nametv);
            pricetv = (TextView) v.findViewById(R.id.item_finder_drawer_pricetv);
            img = (ImageView) v.findViewById(R.id.item_finder_drawer_img);
        }
    }
}
