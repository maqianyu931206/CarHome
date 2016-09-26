package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ListTypeBean;
import com.maqianyu.carhome.ui.Bean.SaleLikeBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/13.
 * listView多种行布局使用的适配器
 */
public class SaleLvAdapter extends BaseAdapter {
    private List<SaleLikeBean.ResultBean.GoodslistBean.ListBean> datas;
    private Context context;
    private static final int TYPR_ALL = 0;
    private static final int TYPR_ONR_IMG = 1;
    private LayoutInflater inflater;

    public void setDatas(List<SaleLikeBean.ResultBean.GoodslistBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public SaleLvAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
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

    // 根据position位置获取数据的集合
    // 返回行布局的类型
//    pu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder =null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_sale_lv,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        SaleLikeBean.ResultBean.GoodslistBean.ListBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.priceTv.setText(bean.getPrice());
            SpannableString string = new SpannableString(datas.get(position).getFctprice());
            string.setSpan(new StrikethroughSpan(),0,datas.get(position).getFctprice().length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
            myViewHolder.priceTv2.setText(string);
            myViewHolder.contentTv.setText(bean.getAdinfo());
            Glide.with(context).load(bean.getLogo()).into(myViewHolder.img);
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView titleTv,contentTv,priceTv,priceTv2;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_sale_tilte_tv);
            contentTv = (TextView) view.findViewById(R.id.item_sale_content_tv);
            priceTv = (TextView) view.findViewById(R.id.item_sale_price_tv);
            priceTv2 = (TextView) view.findViewById(R.id.item_sale_price2_tv);
            img = (ImageView) view.findViewById(R.id.item_sale_img);

        }
    }
}
