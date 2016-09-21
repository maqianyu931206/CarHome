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
import com.maqianyu.carhome.ui.Bean.ArticleLetterInfoBean;
import com.squareup.picasso.Picasso;
import java.util.List;

/**
 * Created by dllo on 16/9/14.
 */
public class ArticleLetterInfoAdapter extends BaseAdapter {

    private  List<ArticleLetterInfoBean.ResultBean.MessagelistBean> datas;
    private Context context;

    public ArticleLetterInfoAdapter(Context context) {
        this.context = context;
    }

    public ArticleLetterInfoAdapter(List<ArticleLetterInfoBean.ResultBean.MessagelistBean> datas) {
        this.datas = datas;
    }

    public void setDatas(List<ArticleLetterInfoBean.ResultBean.MessagelistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas == null ? null :datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder ;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_letter_info,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        if (datas != null){
            myViewHolder.newsautherTv.setText(datas.get(position).getAuthorname());
//            myViewHolder.createtimeTv.setText(datas.get(position).getPublishtime());
//            myViewHolder.summeryTv.setText(datas.get(position).getContent());
//            Picasso.with(context).load(datas.get(position).getHeadimg()).into(myViewHolder.img);
        }
        return convertView;
    }

    class MyViewHolder{
        TextView newsautherTv,createtimeTv,summeryTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            newsautherTv = (TextView) view.findViewById(R.id.item_article_letter_info_author_list_tv);
//            createtimeTv = (TextView) view.findViewById(R.id.item_article_letter_info_createtime_list_tv);
//            summeryTv = (TextView) view.findViewById(R.id.item_article_letter_info_summary_list_tv);
//            img  = (ImageView) view.findViewById(R.id.item_article_letter_info_heading_list_img);
        }
    }

}
