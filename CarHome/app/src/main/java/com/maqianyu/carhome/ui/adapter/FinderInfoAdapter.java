package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderInfoBean;
import java.util.List;

/**
 * Created by dllo on 16/9/28.
 */
public class FinderInfoAdapter extends BaseAdapter{
    List<FinderInfoBean.ResultBean.EnginelistBean.SpeclistBean>datas;
    private Context context;

    public FinderInfoAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<FinderInfoBean.ResultBean.EnginelistBean.SpeclistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas == null ? 0 :datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas == null ? null :datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_finder_info,null);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
            myViewHolder.titletv.setText(datas.get(position).getName());
            myViewHolder.pricetv.setText(datas.get(position).getPrice() + "");
            myViewHolder.priceTv.setText(datas.get(position).getMinprice() + "");
        return convertView;

    }

    class MyViewHolder{
        private TextView titletv,pricetv,priceTv;
        public  MyViewHolder(View view){
            titletv = (TextView) view.findViewById(R.id.item_finder_title_tv);
            pricetv = (TextView) view.findViewById(R.id.item_finder_info_price_tv);
            priceTv = (TextView) view.findViewById(R.id.item_finder_info_price_tv2);
        }
    }

}
