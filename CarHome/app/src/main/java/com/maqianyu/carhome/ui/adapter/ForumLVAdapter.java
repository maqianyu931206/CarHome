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
import com.maqianyu.carhome.ui.Bean.ForumLVBean;

import java.util.List;

/**
 * Created by dllo on 16/9/10.
 * 论坛-listview 适配器
 */
public class ForumLVAdapter extends BaseAdapter {
    private Context context;
    private List<ForumLVBean>datas;

    public void setDatas(List<ForumLVBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public ForumLVAdapter(Context context) {
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

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {

            convertView = LayoutInflater.from(context).inflate(R.layout.item_forum_lv,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ForumLVBean myBean = (ForumLVBean) getItem(position);
        viewHolder.nameTv.setText(myBean.getName());
        return convertView;
    }
    class  ViewHolder{
        TextView nameTv;
        public  ViewHolder(View v){
            nameTv = (TextView) v.findViewById(R.id.item_forum_lv_tv);
        }
    }
}
