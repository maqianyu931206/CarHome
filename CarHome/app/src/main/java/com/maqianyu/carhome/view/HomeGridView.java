package com.maqianyu.carhome.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by dllo on 16/9/21.
 */
public class HomeGridView extends GridView {
    public HomeGridView(Context context) {
        super(context);
    }

    public HomeGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expanSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec,expanSpec);
    }
}
