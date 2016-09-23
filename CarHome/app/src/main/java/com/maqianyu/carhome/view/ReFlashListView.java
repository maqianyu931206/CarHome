package com.maqianyu.carhome.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.maqianyu.carhome.R;

import java.text.SimpleDateFormat;
import java.util.Date;

import static com.maqianyu.carhome.R.anim.jiazai;

/**
 * Created by dllo on 16/9/23.
 */
public class ReFlashListView extends ListView implements AbsListView.OnScrollListener {
    View header;   // 顶部布局文件
    int headerHeight;  // 顶部布局文件的高度
    int firstVisibleItem; // 当前界面第一个可见item的位置
    int scrollState;   // 当前滚动状态
    boolean isRemark;  //  标记 当前实在ListView最顶端按下的
    int startY;   // 向下拉的距离Y
    int state;   // 当前的状态
    final int NONE = 0;// 正常状态
    final int PULL = 1;//下拉状态
    final int RELESE = 2; // 松开可以刷新状态
    final int REFLASHING = 3; // 正在刷新状态
    IReflashListener iReflashListener; // 刷新数据的接口

    public ReFlashListView(Context context) {
        super(context);
        initView(context);
    }

    public ReFlashListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public ReFlashListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    // 绑定头布局
    private void initView(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        header = inflater.inflate(R.layout.header_layout, null);
        measureView(header);
        headerHeight = header.getMeasuredHeight();
        topPadding(-headerHeight);
        this.addHeaderView(header);
        this.setOnScrollListener(this);
    }

    // 通知父布局我占了多大地方
    private void measureView(View view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params == null) {
            params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
        int width = ViewGroup.getChildMeasureSpec(0, 0, params.width);
        int height;
        int tempHeight = params.height;
        if (tempHeight > 0) {
            height = MeasureSpec.makeMeasureSpec(tempHeight, MeasureSpec.EXACTLY);
        } else {
            height = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED);
        }
        view.measure(width, height);
    }

    private void topPadding(int topPadding) {
        header.setPadding(header.getPaddingLeft(), topPadding, header.getPaddingRight(), header.getPaddingBottom());
        header.invalidate();
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        this.scrollState = scrollState;
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        this.firstVisibleItem = firstVisibleItem;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:// 按下鼠标时触发
                if (firstVisibleItem == 0) {
                    isRemark = true;
                    startY = (int) ev.getY();
                }
                break;
            case MotionEvent.ACTION_MOVE:
                onMove(ev);
                break;
            case MotionEvent.ACTION_UP:   // 抬起鼠标时触发
                if (state == RELESE) {
                    // 加载最新数据
                    state = REFLASHING;
                    iReflashListener.onReflash();
                    reflashViewByState();
                } else if (state == PULL) {
                    state = NONE;
                    isRemark = false;
                    reflashViewByState();
                }
                break;
        }
        return super.onTouchEvent(ev);
    }

    /**
     * 判断移动过程中的操作
     */
    private void onMove(MotionEvent ev) {
        if (!isRemark) {
            return;
        }
        int tempY = (int) ev.getY();
        int space = tempY - startY;
        int topPadding = space - headerHeight;
        switch (state) {
            case NONE:
                if (space > 0) {
                    state = PULL;
                    reflashViewByState();
                }
                break;
            case PULL:
                topPadding(topPadding);
                if (space > headerHeight + 40 && scrollState == SCROLL_STATE_TOUCH_SCROLL) {
                    state = RELESE;
                    reflashViewByState();
                }
                break;
            case RELESE:
                topPadding(topPadding);
                if (space < headerHeight + 40) {
                    state = PULL;
                    reflashViewByState();
                } else if (space <= 0) {
                    state = NONE;
                    isRemark = false;
                    reflashViewByState();
                }
                break;
            case REFLASHING:
                break;
        }
    }

    private void reflashViewByState() {
        TextView tip = (TextView) header.findViewById(R.id.tip);
        ImageView imageView = (ImageView) header.findViewById(R.id.progress);
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.jiazai);
        imageView.setAnimation(animation);
        switch (state) {
            case NONE:
                topPadding(-headerHeight);
                break;
            case PULL:
                imageView.setVisibility(View.GONE);
                tip.setText("下拉刷新");
                break;
            case RELESE:
                imageView.setVisibility(View.GONE);
                tip.setText("松开刷新");
                break;
            case REFLASHING:
                topPadding(50);
                imageView.setVisibility(View.VISIBLE);
                tip.setText("正在加载...");
                break;
        }
    }

    // 获取完数据
    public void reflshComplete() {
        state = NONE;
        isRemark = false;
        reflashViewByState();
        TextView lastupdateTime = (TextView) header.findViewById(R.id.lastupdate_time);
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String time = format.format(date);
        lastupdateTime.setText(time);
    }

    public void setInterface(IReflashListener iReflashListener) {
        this.iReflashListener = iReflashListener;
    }

    /**
     * 刷新数据接口
     */
    public interface IReflashListener {
        void onReflash();
    }

}
