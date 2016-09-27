package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ArticleUnihubBean;
import com.maqianyu.carhome.utils.ScressSizeUtil;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by dllo on 16/9/14.
 * 推荐-优创+ -- 适配器
 */
public class ArticleUnihubAdapter extends BaseAdapter {

    private Context context;
    List<ArticleUnihubBean.ResultBean.NewslistBean>datas;

    public void setDatas(List<ArticleUnihubBean.ResultBean.NewslistBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    public ArticleUnihubAdapter(Context context) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_unihub,parent,false);
            myViewHolder = new MyViewHolder(convertView);
            convertView.setTag(myViewHolder);
        }else {
            myViewHolder = (MyViewHolder) convertView.getTag();
        }
        ArticleUnihubBean.ResultBean.NewslistBean bean = datas.get(position);
        if (bean != null){
            myViewHolder.usernameTv.setText(bean.getUsername());
            myViewHolder.dateTv.setText(bean.getPublishtime()+ "");
            myViewHolder.titleTv.setText(bean.getTitle());
            myViewHolder.replycountTv.setText(bean.getReplycount()+"");
            myViewHolder.praisenumTv.setText(bean.getPraisenum()+"");
            Picasso.with(context).load(bean.getUserpic()).resize(40,32).into(myViewHolder.img);
            Picasso.with(context).load(bean.getThumbnailpics().get(0)).resize(200,180).into(myViewHolder.img2);
        }
        return convertView;
    }
    // 缓存类
    class MyViewHolder{
        TextView usernameTv,dateTv,titleTv,praisenumTv,replycountTv;
        ImageView img,img2;
        public MyViewHolder(View view){
            super();
            usernameTv = (TextView) view.findViewById(R.id.item_unihub_title_tv);
            dateTv = (TextView) view.findViewById(R.id.item_unihub_date_tv);
            praisenumTv = (TextView) view.findViewById(R.id.item_unihub_praisenum_tv);
            titleTv  = (TextView) view.findViewById(R.id.item_unihub_content_tv);
            replycountTv  = (TextView) view.findViewById(R.id.item_unihub_replycount_tv);
            img = (ImageView) view.findViewById(R.id.item_unihub_small_img);
            img2 = (ImageView) view.findViewById(R.id.item_unihub_big_img);
        }
    }


}
