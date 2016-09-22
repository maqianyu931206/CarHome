package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ForumForumBean;

import java.util.List;

/**
 * Created by dllo on 16/9/18.
 */
public class ForumForumAdapter extends BaseAdapter {
    private List<ForumForumBean.ResultBean.ListBean> datas;
    private Context context;

    public void setDatas(List<ForumForumBean.ResultBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public ForumForumAdapter(Context context) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_forum_forum,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        ForumForumBean.ResultBean.ListBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.dateTv.setText(bean.getPostdate());
            myViewHolder.numTv.setText(bean.getReplycounts()+"回帖");
           myViewHolder.Tv.setText(bean.getBbsname());
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView titleTv,dateTv,numTv,Tv;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_forum_forum_title_tv);
            dateTv = (TextView) view.findViewById(R.id.item_forum_forum_postdate_tv);
            numTv = (TextView) view.findViewById(R.id.item_forum_forum_num_tv);
            Tv  = (TextView) view.findViewById(R.id.item_forum_forum_bbsName_tv);
        }
    }
}
