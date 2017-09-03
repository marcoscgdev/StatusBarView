package com.marcoscg.statusbarview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by @MarcosCGdev on 03/09/2017.
 */

public class NavigationBarView extends View {

    public NavigationBarView(Context context) {
        super(context);
    }

    public NavigationBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavigationBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(widthMeasureSpec, Utils.getNavigationBarHeight(this.getContext()));
    }

}