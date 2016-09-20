package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandCarNameBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.maqianyu.carhome.utils.Contact;
import com.maqianyu.carhome.utils.ContactComparator;
import com.maqianyu.carhome.utils.ScressSizeUtil;
import com.maqianyu.carhome.utils.Utils;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by dllo on 16/9/18.
 */
public class FinderBrandCarNameRvAdapter extends RecyclerView.Adapter<FinderBrandCarNameRvAdapter.MyViewHolder> {
    private Context context;
    private List<FinderBrandCarNameBean.ResultBean.BrandlistBean.ListBean>datas;
    private ForumIntance forumIntance;
    private int layoutPosition;

    public FinderBrandCarNameRvAdapter(Context context) {
        this.context = context;
    }

    public void setForumIntance(ForumIntance forumIntance) {
        this.forumIntance = forumIntance;
    }

    public void setDatas(List<FinderBrandCarNameBean.ResultBean.BrandlistBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_finder_carname,null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        if (holder != null){
            holder.titleTv.setText(datas.get(position).getName());
            Picasso.with(context).load(datas.get(position).getImgurl()).into(holder.img);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (forumIntance != null) {
                    layoutPosition =holder.getLayoutPosition();
                    FinderBrandCarNameBean.ResultBean.BrandlistBean.ListBean str = datas.get(layoutPosition);
                    forumIntance.ForumItemListener(layoutPosition, str);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }


    // 缓存类
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv;
        ImageView img;

        public MyViewHolder(View itemView){
            super(itemView);
            titleTv = (TextView) itemView.findViewById(R.id.item_finder_carname_tv);
           img = (ImageView) itemView.findViewById(R.id.item_finder_carname_img);

        }
    }



}
