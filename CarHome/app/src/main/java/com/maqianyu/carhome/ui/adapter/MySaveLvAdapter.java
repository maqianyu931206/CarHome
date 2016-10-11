package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.LiteOrmBean;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by dllo on 16/10/8.
 */
public class MySaveLvAdapter extends BaseAdapter {
    private List<LiteOrmBean> datas;
    private Context context;

    public void setDatas(List<LiteOrmBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public MySaveLvAdapter(Context context) {
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
        MyViewHolder myViewHolder ;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_my_save,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        LiteOrmBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.priceTv.setText(bean.getPrice());
            if (!bean.getImgUrl().isEmpty()) {
                Picasso.with(context).load(bean.getImgUrl()).into(myViewHolder.img);
            }else {
                myViewHolder.img.setImageResource(R.mipmap.csrhome);
            }
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView titleTv,priceTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_my_save_title);
            priceTv = (TextView) view.findViewById(R.id.item_my_save_price);
            img = (ImageView) view.findViewById(R.id.item_my_save_img);

        }
    }
    public void remove(LiteOrmBean liteOrmBean){
        datas.remove(liteOrmBean);
        notifyDataSetChanged();
    }

}
