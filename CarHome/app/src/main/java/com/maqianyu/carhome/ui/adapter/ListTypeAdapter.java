package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ListTypeBean;

import java.util.List;

/**
 * Created by dllo on 16/9/13.
 * 推荐首页-listView多种行布局使用的适配器
 */
public class ListTypeAdapter extends BaseAdapter {
    private List<ListTypeBean.ResultBean.NewslistBean> datas;
    private Context context;
    private static final int TYPR_ALL = 0;
    private static final int TYPR_ONR_IMG = 1;
    private LayoutInflater inflater;

    public void setDatas(List<ListTypeBean.ResultBean.NewslistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public ListTypeAdapter(Context context) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_one_img,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
       ListTypeBean.ResultBean.NewslistBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.dateTv.setText(bean.getTime());
            myViewHolder.numTv.setText(bean.getReplycount()+"人浏览");
            Glide.with(context).load(bean.getSmallpic()).into(myViewHolder.img);
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView titleTv,dateTv,numTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_one_title_tv);
            dateTv = (TextView) view.findViewById(R.id.item_one_date_tv);
            numTv = (TextView) view.findViewById(R.id.item_one_num_tv);
            img = (ImageView) view.findViewById(R.id.item_one_img);

        }
    }
}
