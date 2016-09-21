package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleMediaBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/13.
 * 推荐-复用的Adapter
 */
public class ArticleOriginalVideoAdapter extends BaseAdapter {
    private  List<ArticleMediaBean.ResultBean.ListBean> datas;
    private Context context;

    public void setDatas(List<ArticleMediaBean.ResultBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public ArticleOriginalVideoAdapter(Context context) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_copy,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        ArticleMediaBean.ResultBean.ListBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.dateTv.setText(bean.getTime());
            myViewHolder.numTv.setText(bean.getReplycount()+"播放");
            Picasso.with(context).load(bean.getSmallimg()).into(myViewHolder.img);
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView titleTv,dateTv,numTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_copy_title_tv);
            dateTv = (TextView) view.findViewById(R.id.item_copy_date_tv);
            numTv = (TextView) view.findViewById(R.id.item_copy_num_tv);
            img = (ImageView) view.findViewById(R.id.item_copy_img);

        }
    }


}
