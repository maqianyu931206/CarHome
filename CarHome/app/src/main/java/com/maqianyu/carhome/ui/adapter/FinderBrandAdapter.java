package com.maqianyu.carhome.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.Bean.FinderBrandBean;
import java.util.List;

/**
 * Created by dllo on 16/9/14.
 * 找车-品牌-适配器
 */
//public class FinderBrandAdapter extends BaseExpandableListAdapter {
//    private  List<FinderBrandBean.ResultBean.BrandlistBean> datas;
//    private  List<FinderBrandBean.ResultBean.BrandlistBean.ListBean> datas2;
//    private Context context;
//    private List<FinderBrandBean.ResultBean.BrandlistBean> groupDatas;
//    private List<List<FinderBrandBean.ResultBean.BrandlistBean>> group_list;
//
//    public void setGroup_list(List<List<FinderBrandBean.ResultBean.BrandlistBean>> group_list) {
//        this.group_list = group_list;
//        notifyDataSetChanged();
//    }
//
//    public void setGroupDatas(List<FinderBrandBean.ResultBean.BrandlistBean> groupDatas) {
//        this.groupDatas = groupDatas;
//        notifyDataSetChanged();
//    }
//
//    public FinderBrandAdapter(List<FinderBrandBean.ResultBean.BrandlistBean> groupDatas) {
//        this.groupDatas = groupDatas;
//        notifyDataSetChanged();
//    }
//
//    public FinderBrandAdapter(Context context) {
//        this.context = context;
//    }
//    @Override
//    public int getGroupCount() {
//        return 21;
//    }
//    @Override
//    public int getChildrenCount(int groupPosition) {
//        return group_list.get(groupPosition).size();
//    }
//
//    @Override
//    public Object getGroup(int groupPosition) {
//        return groupDatas.get(groupPosition);
//    }
//
//    @Override
//    public Object getChild(int groupPosition, int childPosition) {
//        return group_list.get(groupPosition).get(childPosition);
//    }
//
//    @Override
//    public long getGroupId(int groupPosition) {
//        return groupPosition;
//    }
//
//    @Override
//    public long getChildId(int groupPosition, int childPosition) {
//        return childPosition;
//    }
//
//    @Override
//    public boolean hasStableIds() {
//        return true;
//    }
//
//    @Override
//    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
//
//        GroupViewHolder groupViewHolder = null;
//        if (convertView == null){
//            convertView = LayoutInflater.from(context).inflate(R.layout.item_finder_group,parent,false);
//           groupViewHolder = new GroupViewHolder(convertView);
//            convertView.setTag(groupViewHolder);
//        }else{
//            groupViewHolder = (GroupViewHolder) convertView.getTag();
//            FinderBrandBean.ResultBean.BrandlistBean bean = datas.get(groupPosition);
//            groupViewHolder.group_tv.setText(bean.getLetter());
//        }
//        return convertView;
//    }
//
//    @Override
//    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
//        ChildViewHolder childViewHolder = null;
//        if (convertView == null){
//            convertView = LayoutInflater.from(context).inflate(R.layout.item_finder_child,parent,false);
//            childViewHolder = new ChildViewHolder(convertView);
//            convertView.setTag(childViewHolder);
//        }else {
//            childViewHolder = (ChildViewHolder) convertView.getTag();
//            FinderBrandBean.ResultBean.BrandlistBean.ListBean bean2 = datas2.get(childPosition);
//            childViewHolder.child_tv.setText(bean2.getName());
//        }
//        return convertView;
//    }
//
//    @Override
//    public boolean isChildSelectable(int groupPosition, int childPosition) {
//
//        return true;
//    }
//
//    // 缓存类
//    class ChildViewHolder{
//       private TextView child_tv;
//
//        public ChildViewHolder(View view){
//            super();
//            child_tv = (TextView) view.findViewById(R.id.item_group_tv);
//
//        }
//    }
//    class GroupViewHolder{
//        private TextView group_tv;
//        public  GroupViewHolder(View view){
//            group_tv = (TextView) view.findViewById(R.id.item_child_tv);
//        }
//    }
//}
