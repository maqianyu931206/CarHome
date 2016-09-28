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
            myViewHolder.tv.setText(datas.get(position).getName());
            myViewHolder.tv2.setText(datas.get(position).getPrice() + "");
        return convertView;
    }

    class MyViewHolder{
        private TextView tv,tv2;
        public  MyViewHolder(View view){
            tv = (TextView) view.findViewById(R.id.item_finder_title_tv);
            tv2 = (TextView) view.findViewById(R.id.item_finder_info_price_tv);
        }
    }

}
