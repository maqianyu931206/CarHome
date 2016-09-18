package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ForumAnsleseBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/18.
 */
public class ForumAnsleseAdpater extends BaseAdapter {
    private List<ForumAnsleseBean.ResultBean.ListBean> datas;
    private Context context;

    public void setDatas(List<ForumAnsleseBean.ResultBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }
    public ForumAnsleseAdpater(Context context) {
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
        ForumAnsViewHolder forumAnsViewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_forum_anslese, null);
            forumAnsViewHolder = new ForumAnsViewHolder(convertView);
            convertView.setTag(forumAnsViewHolder);
        } else {
            forumAnsViewHolder = (ForumAnsViewHolder) convertView.getTag();
        }
        ForumAnsleseBean.ResultBean.ListBean bean = datas.get(position);
        forumAnsViewHolder.titleTv.setText(bean.getTitle());
        forumAnsViewHolder.bbsnameTv.setText(bean.getBbsname());
        forumAnsViewHolder.numTv.setText(bean.getReplycounts()+"人浏览");
        Picasso.with(context).load(bean.getSmallpic()).resize(130,105).into(forumAnsViewHolder.img);
        return convertView;
    }
    class ForumAnsViewHolder {
        TextView titleTv, bbsnameTv, numTv;
        ImageView img;
        public ForumAnsViewHolder(View view) {
            titleTv = (TextView) view.findViewById(R.id.item_forum_title_tv);
            bbsnameTv = (TextView) view.findViewById(R.id.item_forum_bbsName_tv);
            numTv = (TextView) view.findViewById(R.id.item_forum_num_tv);
            img = (ImageView) view.findViewById(R.id.item_forum_img);
        }
    }
}
