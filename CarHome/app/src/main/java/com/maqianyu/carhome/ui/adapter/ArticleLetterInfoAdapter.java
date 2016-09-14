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

    private Context context;
    private ArticleLetterInfoBean datas;


    public ArticleLetterInfoAdapter(Context context) {
        this.context = context;
    }

    public ArticleLetterInfoAdapter(ArticleLetterInfoBean datas) {
        this.datas = datas;
    }

    public void setDatas(ArticleLetterInfoBean datas) {
        this.datas = datas;
        Log.d("fff", "datas:*****" + datas);
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : 10;
    }

    @Override
    public Object getItem(int position) {
        return datas == null ? null :datas.getResult();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder =null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_letter_info,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        Log.d("fff", datas.getResult().getNewsdata().getNewsauthor());
        if (datas != null){
            Log.d("fff", "datas:" + datas);
            myViewHolder.newsautherTv.setText(datas.getResult().getNewsdata().getNewsauthor());
            myViewHolder.createtimeTv.setText(datas.getResult().getNewsdata().getShowstate());
            myViewHolder.summeryTv.setText(datas.getResult().getNewsdata().getSummary());
        }
        return convertView;
    }

    class MyViewHolder{
        TextView newsautherTv,createtimeTv,summeryTv;
        public MyViewHolder(View view){
            super();
            newsautherTv = (TextView) view.findViewById(R.id.item_letter_newsauther_tv);
            createtimeTv = (TextView) view.findViewById(R.id.item_letter_createtime_tv);
            summeryTv = (TextView) view.findViewById(R.id.item_letter_summary_tv);
        }
    }

}
