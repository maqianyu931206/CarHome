package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleCopyNewsBean;
import com.maqianyu.carhome.utils.ScressSizeUtil;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/13.
 * 推荐-复用的Adapter
 */
public class ArticleCopyAdapter extends BaseAdapter {
    private  List<ArticleCopyNewsBean.ResultBean.NewslistBean> datas;
    private Context context;

    public void setDatas(List<ArticleCopyNewsBean.ResultBean.NewslistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public ArticleCopyAdapter(Context context) {
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder =null;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_copy,parent,false);
            // 加载完行布局设置其高度
            // 方法1:设置其最小高度
            // 方法2:通过布局参数修改参数
            int height = ScressSizeUtil.getScreenSize(context,1);
            int width = ScressSizeUtil.getScreenSize(context,2);
            ViewGroup.LayoutParams params = convertView.getLayoutParams();
            params.width = width;
            params.height = height / 5;
            convertView.setLayoutParams(params);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        ArticleCopyNewsBean.ResultBean.NewslistBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.dateTv.setText(bean.getTime());
            myViewHolder.numTv.setText(bean.getReplycount()+"人浏览");
            Glide.with(context).load(bean.getSmallpic()).into(myViewHolder.img);
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView titleTv,dateTv,numTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_copy_title_tv);
            dateTv = (TextView) view.findViewById(R.id.item_copy_date_tv);
            numTv = (TextView) view.findViewById(R.id.item_copy_num_tv);
            img = (ImageView) view.findViewById(R.id.item_copy_img);

        }
    }


}
