package com.maqianyu.carhome.ui.fragment.article;

import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.maqianyu.carhome.R;
import com.maqianyu.carhome.ui.fragment.AbsBaseFragment;

/**
 * Created by dllo on 16/9/9.
 */
public class ArticleNewFragment extends AbsBaseFragment {
    private ViewFlipper flipper;
    private int[] resId = {R.mipmap.nav_icon_findcar_p,R.mipmap.nav_icon_forum_p,R.mipmap.nav_icon_article_p};
    @Override
    protected int setLayout() {
        return R.layout.fragment_article_new;
    }

    @Override
    protected void initViews() {
        flipper= byView(R.id.flipper);
    }

    @Override
    protected void initData() {
        for (int i = 0; i < resId.length; i++) {
            flipper.addView(getImageView(resId[i]));
        }
        flipper.setInAnimation(getContext(),R.anim.left_in);
        flipper.setOutAnimation(getContext(),R.anim.left_out);
        flipper.setFlipInterval(10000);
        flipper.startFlipping();

    }
    private ImageView getImageView(int resId){
        ImageView image = new ImageView(getContext());
        image.setBackgroundResource(resId);
        return  image;
    }

//    public boolean OnTouchEvent(MotionEvent event) {
//       switch (event.getAction()){
//           case MotionEvent.ACTION_DOWN:
//           event.getX();
//               break;
//           case MotionEvent.ACTION_HOVER_MOVE:
//               if (event.getX() == 0){
//                   flipper.setInAnimation(getContext(),R.anim.left_in);
//                   flipper.setOutAnimation(getContext(),R.anim.left_out);
//                   flipper.showPrevious();
//               }
//           case MotionEvent.ACTION_UP:
//                   break;
//
//       }
//        return true;
//    }
}
