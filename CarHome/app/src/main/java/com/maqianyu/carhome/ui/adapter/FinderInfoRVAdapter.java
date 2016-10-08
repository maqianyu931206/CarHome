package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderInfoBean;

import java.util.List;


/**
 * Created by dllo on 16/9/30.
 */
public class FinderInfoRVAdapter extends RecyclerView.Adapter<FinderInfoRVAdapter.MyViewHolder> {
    List<FinderInfoBean.ResultBean.TabinfosBean>datas;
    private Context context;


    public FinderInfoRVAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<FinderInfoBean.ResultBean.TabinfosBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_finder_rv_info,null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tabtitlt.setText(datas.get(position).getTabtitle());
        holder.tabsubtitle.setText(Html.fromHtml(datas.get(position).getTabsubtitle()));

    }


    @Override
    public int getItemCount() {
        return datas == null ? 0 :datas.size();

    }

    class  MyViewHolder extends RecyclerView.ViewHolder{
       TextView tabtitlt,tabsubtitle;

        public MyViewHolder(View itemView) {
            super(itemView);
            tabtitlt = (TextView) itemView.findViewById(R.id.item_finder_Rv_info_tabtitle);
            tabsubtitle = (TextView) itemView.findViewById(R.id.item_finder_Rv_info_tabsubtitle);
        }
    }
}
