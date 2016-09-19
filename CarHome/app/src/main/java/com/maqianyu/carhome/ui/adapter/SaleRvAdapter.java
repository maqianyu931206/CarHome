package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderBrandHotBean;
import com.maqianyu.carhome.ui.Bean.SaleRvBean;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/18.
 */
public class SaleRvAdapter extends RecyclerView.Adapter<SaleRvAdapter.MyViewHolder> {
    private Context context;
    private List<SaleRvBean.ResultBean.FunctionlistBean>datas;
    private ForumIntance forumIntance;
    private int layoutPosition;

    public SaleRvAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<SaleRvBean.ResultBean.FunctionlistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public void setForumIntance(ForumIntance forumIntance) {
        this.forumIntance = forumIntance;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_finder_brand,null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (holder != null){
            holder.tv.setText(datas.get(position).getTitle());
            Picasso.with(context).load(datas.get(position).getIconurl()).into(holder.img);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (forumIntance != null) {
                    layoutPosition = holder.getLayoutPosition();
                    SaleRvBean.ResultBean.FunctionlistBean str = datas.get(layoutPosition);
                    forumIntance.ForumItemListener(layoutPosition, str);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas == null ? 0 : datas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.item_finder_brand_hot_img);
            tv = (TextView) itemView.findViewById(R.id.item_finder_brand_hot_tv);
        }
    }

}
