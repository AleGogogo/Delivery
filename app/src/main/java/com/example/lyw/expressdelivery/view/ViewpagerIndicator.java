package com.example.lyw.expressdelivery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.lyw.expressdelivery.R;

import static android.content.ContentValues.TAG;

/**
 * Created by LYW on 2017/3/14.
 */

public class ViewpagerIndicator extends LinearLayout {
    public static final int DEFAUL_VISIBLE_COUNT = 4;
    private static final String TAG = "ViewpagerIndicator";
    //可见tab
    private int mVisibleCount;
    private int mInitTranslateX;
    private ViewPager mViewPager;
    private int mTranslateX;
    private int mLineWidth;
    private int mRectangleHeight;
    private Context mContext;
    private Paint mPaint;
    private Path mPath;
    private static final int TEXT_COLOR_LIGHT = 0x4169E1;
    private static final int TEXT_COLOR_NORMAL = 0x8B8989;

    public ViewpagerIndicator(Context context) {
        this(context, null);
    }

    public ViewpagerIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewpagerIndicator(Context context, AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R
                .styleable.ViewPagerIndicator);
        mVisibleCount = typedArray.getInt(R.styleable
                .ViewPagerIndicator_visible_count, DEFAUL_VISIBLE_COUNT);
        if (mVisibleCount < 0) {
            mVisibleCount = DEFAUL_VISIBLE_COUNT;
        }
        //不知道这个是干什么的
        typedArray.recycle();
        mPaint = new Paint();
        //要做到防止锯齿，我们就要使用到这个参数。
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.parseColor("#4169E1"));
        mPaint.setStrokeWidth(10);
        mPaint.setStyle(Paint.Style.FILL);
        Log.d(TAG, "ViewpagerIndicator: 初始化");
    }

    /**
     * 加载完xml文件就会调这个方法
     */
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        int cCount = getChildCount();
        if (cCount == 0) return;
        for (int i = 0; i < cCount; i++) {
            View view = getChildAt(i);
            LayoutParams lp = (LayoutParams) view.getLayoutParams();
            lp.weight = 0;
            lp.weight = getScreenWidth() / mVisibleCount;
            view.setLayoutParams(lp);
            Log.d(TAG, "onFinishInflate: 解析完xml了");
        }
        // TODO: 2017/3/14 这里设置tab点击事件的处理
    }

    /**
     * 在这里画长方形
     * 绘制VIew本身的内容，通过调用View.onDraw(canvas)函数实现
     * 绘制自己的孩子通过dispatchDraw（canvas）实现
     *
     * @param canvas
     */
    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        mLineWidth = getScreenWidth() / mVisibleCount ;
        canvas.drawLine(0,getBottom(),mLineWidth,getBottom(),mPaint);
        canvas.restore();
        Log.d(TAG, "dispatchDraw: 开始画指示器了");
        super.dispatchDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mLineWidth = w / mVisibleCount;
        mInitTranslateX = 0;
        initLinePath();
        Log.d(TAG, "onSizeChanged: 开始滑动了");
    }

    private void initLinePath() {

        mPath = new Path();

        mPath.moveTo(0, 0);

        mPath.lineTo(0, 0);

        mPath.lineTo(mLineWidth, 0);

        mPath.close();


    }

    private int getScreenWidth() {
        WindowManager wm = (WindowManager) mContext.getSystemService(Context
                .WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    private void highLightTextView(int position) {
        resetTextViewColor();
        View view = getChildAt(position);

        if (view instanceof TextView) {
            ((TextView) view).setTextColor(TEXT_COLOR_LIGHT);
        }
    }

    private void resetTextViewColor() {
        int cCount = getChildCount();
        for (int i = 0; i < cCount; i++) {
            View view = getChildAt(i);
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(TEXT_COLOR_NORMAL);
            }
        }
    }

    public void setViewPage(ViewPager viewPage, int i) {
        mViewPager = viewPage;
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener
                () {


            @Override
            public void onPageScrolled(int position, float
                    positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                highLightTextView(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
