package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.ListTypeBean;
import com.maqianyu.carhome.ui.Bean.RotateBean;
import com.maqianyu.carhome.ui.activity.LunBoInfoActivity;

import java.util.List;

/**
 * Created by dllo on 16/9/12.
 * 轮播图使用的适配器
 */
public class RotateArticleAdapter extends PagerAdapter {
    private List<RotateBean>datas;
    private Context context;
    private LayoutInflater inflater;


    public RotateArticleAdapter(List<RotateBean> datas, Context context) {
        this.datas = datas;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public RotateArticleAdapter(Context context) {
         this.context = context;
    }

    public void setDatas(List<RotateBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        // 为了让ViewPager到最后一页不会像翻书一样回到第一页
        // 设置页数为int最大值,这样向下滑动永远都是下一页
        return datas == null ? 0 : Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        // position是int最大值所以这里可能是几百甚至上千,因此取余避免数组越界
        final int newPosition = position % datas.size();
        View convertView = inflater.inflate(R.layout.item_rotate_vp, container, false);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.item_iv);
        RotateBean bean =datas.get(newPosition);
        Glide.with(context).load(bean.getImgUrl()).into(imageView);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, LunBoInfoActivity.class);
                intent.putExtra("ps",newPosition);
                context.startActivity(intent);
            }
        });
        container.addView(convertView);
        return convertView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}
