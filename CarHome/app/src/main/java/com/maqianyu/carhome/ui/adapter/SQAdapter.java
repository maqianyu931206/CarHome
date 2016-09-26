package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.SQBean;

import java.util.List;

/**
 * Created by dllo on 16/9/26.
 */
public class SQAdapter extends BaseAdapter {
    private Context context;
    private List<SQBean> datas;


    public SQAdapter(List<SQBean> datas) {
        this.datas = datas;
    }

    public SQAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<SQBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas != null && datas.size() > 0 ? datas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return datas != null && datas.size() > 0 ? datas.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler viewHodler;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_save, parent, false);
            viewHodler = new ViewHodler(convertView);
            convertView.setTag(viewHodler);
        } else {
            viewHodler = (ViewHodler) convertView.getTag();
        }
        viewHodler.nameTv.setText(datas.get(position).getUrl());

        return convertView;
    }

    class ViewHodler {
        TextView nameTv;

        public ViewHodler(View view) {
            nameTv = (TextView) view.findViewById(R.id.item_save_tv);

        }


    }
}

