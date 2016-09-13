package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleLettersBean;
import com.maqianyu.carhome.utils.ScressSizeUtil;
import com.squareup.picasso.Picasso;
import java.util.List;
/**
 * Created by dllo on 16/9/13.
 * 推荐-快报-适配器
 */
public class ArticleLetterAdapter extends BaseAdapter {
    private List<ArticleLettersBean.ResultBean.ListBean>datas;
    private Context context;

    public ArticleLetterAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<ArticleLettersBean.ResultBean.ListBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_letter,parent,false);
            // 加载完行布局设置其高度
            // 方法1:设置其最小高度
            // 方法2:通过布局参数修改参数
//            int height = ScressSizeUtil.getScreenSize(context,1);
//            int width = ScressSizeUtil.getScreenSize(context,2);
//            ViewGroup.LayoutParams params = convertView.getLayoutParams();
//            params.width = width;
//            params.height = height/2;
//            convertView.setLayoutParams(params);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }

        ArticleLettersBean.ResultBean.ListBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.titleTv.setText(bean.getTitle());
            Log.d("aaa", bean.getTitle());
            myViewHolder.dateTv.setText(bean.getCreatetime());
            myViewHolder.numTv.setText(bean.getReviewcount()+"人浏览");
            Glide.with(context).load(bean.getImg()).into(myViewHolder.img);
        }
        return convertView;
    }
    class MyViewHolder{
        TextView titleTv,dateTv,numTv;
        ImageView img;
        public MyViewHolder(View view){
            super();
            titleTv = (TextView) view.findViewById(R.id.item_letter_title_tv);
            dateTv = (TextView) view.findViewById(R.id.item_letter_date_tv);
            numTv = (TextView) view.findViewById(R.id.item_letter_num_tv);
            img = (ImageView) view.findViewById(R.id.item_letter_img);

        }
    }
}
