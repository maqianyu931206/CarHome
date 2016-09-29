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
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by dllo on 16/9/21.
 */
public class ArticleLetterTvGridViewAdapter extends BaseAdapter {
    List<ArticleLetterInfoBean.ResultBean.MessagelistBean.CommentlistBean>datas;
    private Context context;

    public ArticleLetterTvGridViewAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<ArticleLetterInfoBean.ResultBean.MessagelistBean.CommentlistBean> datas) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_article_letter_info_gridview2,parent,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        if (datas.get(position).getHeadimg() != "") {
            viewHolder.tv1.setText(datas.get(position).getUsername());
            viewHolder.tv2.setText(datas.get(position).getContent());
            Picasso.with(context).load(datas.get(position).getHeadimg()).into(viewHolder.img);
        }
        if (datas.get(position).getHeadimg() == ""){
            viewHolder.img.setImageResource(R.mipmap.morentouxiang );
            viewHolder.tv1.setText(datas.get(position).getUsername());
            viewHolder.tv2.setText(datas.get(position).getContent());

        }
        return convertView;
    }
    class  ViewHolder{

        TextView tv1,tv2;
        CircleImageView img;
        public  ViewHolder(View v){
            tv1 = (TextView) v.findViewById(R.id.item_article_letter_info_small_tv);
            tv2 = (TextView) v.findViewById(R.id.item_article_letter_info_small_content_tv);
            img = (CircleImageView) v.findViewById(R.id.item_article_letter_info_small_img);
        }
    }
}
