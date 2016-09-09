package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maqianyu.carhome.R;

import java.util.List;

/**
 * Created by dllo on 16/9/9.
 */
public class ForumRvAdapter extends RecyclerView.Adapter<ForumRvAdapter.MyViewHolder> {

    private Context context;
    private List<String>datas;

    public ForumRvAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_forum,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas != null && datas.size() > 0 ? datas.size() : 0;
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{
       private TextView tv;
       public  MyViewHolder(View itemView){
           super(itemView);
           tv = (TextView) itemView.findViewById(R.id.item_forum_tv);
       }
   }
}
