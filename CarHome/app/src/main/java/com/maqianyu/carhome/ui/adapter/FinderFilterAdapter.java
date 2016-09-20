package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.ui.Bean.FinderchioceBean;
import com.maqianyu.carhome.utils.ScressSizeUtil;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/20.
 */
public class FinderFilterAdapter extends BaseAdapter {
    private List<FinderchioceBean.ResultBean.SeriesBean> datas;
    private Context context;

    public void setDatas(List<FinderchioceBean.ResultBean.SeriesBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public FinderFilterAdapter(Context context) {
        this.context = context;
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
        MyViewHolder myViewHolder =null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_finder_filter,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        FinderchioceBean.ResultBean.SeriesBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getSeriesname());
            myViewHolder.priceTv.setText(bean.getPricerange());
            Picasso.with(context).load(bean.getThumburl()).into(myViewHolder.img);
        }
        return convertView;
    }
    class MyViewHolder{
        TextView titleTv,priceTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_filter_title_tv);
            img = (ImageView) view.findViewById(R.id.item_finder_filter_img);
            priceTv = (TextView) view.findViewById(R.id.item_filter_price_tv);

        }
    }

}
