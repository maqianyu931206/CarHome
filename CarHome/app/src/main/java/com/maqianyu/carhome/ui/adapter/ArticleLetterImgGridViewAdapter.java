package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleLetterInfoBean;
import com.maqianyu.carhome.ui.Bean.FinderBrandCarNameBean;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/21.
 */
public class ArticleLetterImgGridViewAdapter extends BaseAdapter {
    List<ArticleLetterInfoBean.ResultBean.MessagelistBean.AttachmentsBean>datas;
    private Context context;

    public ArticleLetterImgGridViewAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<ArticleLetterInfoBean.ResultBean.MessagelistBean.AttachmentsBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas == null ? 0 : datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas  == null ? null : datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_article_letter_info_gridview,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Picasso.with(context).load(datas.get(position).getPicurl()).into(viewHolder.img);
        return convertView;
    }
    class  ViewHolder{

        ImageView img;
        public  ViewHolder(View v){
            img = (ImageView) v.findViewById(R.id.item_article_letter_info_img);
        }
    }
}
