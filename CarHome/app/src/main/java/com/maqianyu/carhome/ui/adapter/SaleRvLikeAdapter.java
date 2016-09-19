package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.SaleLikeBean;
import com.maqianyu.carhome.ui.Bean.SaleRvBean;
import com.maqianyu.carhome.ui.inteface.ForumIntance;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/18.
 */
public class SaleRvLikeAdapter extends RecyclerView.Adapter<SaleRvLikeAdapter.MyViewHolder> {
    private Context context;
    private List<SaleLikeBean.ResultBean.ModulelistBean.ListBean>datas;
    private ForumIntance forumIntance;
    private int layoutPosition;

    public SaleRvLikeAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<SaleLikeBean.ResultBean.ModulelistBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public void setForumIntance(ForumIntance forumIntance) {
        this.forumIntance = forumIntance;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sale_like,null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (holder != null){
            holder.title.setText(datas.get(position).getTitle());
            holder.content.setText(datas.get(position).getShorttitle());
            holder.money.setText(datas.get(position).getPrice());
            holder.price.setText(datas.get(position).getFctprice());
            Glide.with(context).load(datas.get(position).getLogo()).into(holder.img);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (forumIntance != null) {
                    layoutPosition = holder.getLayoutPosition();
                    SaleLikeBean.ResultBean.ModulelistBean.ListBean str = datas.get(layoutPosition);
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
        private TextView title,content,money,price;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.item_sale_like_img);
            title = (TextView) itemView.findViewById(R.id.item_sale_like_title);
            content = (TextView) itemView.findViewById(R.id.item_sale_like_content);
            money = (TextView) itemView.findViewById(R.id.item_sale_like_money);
            price = (TextView) itemView.findViewById(R.id.item_sale_like_price);
        }
    }

}
