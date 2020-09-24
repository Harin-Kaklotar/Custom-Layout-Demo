package com.example.clay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RectangleDemo extends View {

    private static final int SQUARE_SIZE = 200;
    private Rect mSquareRect;
    private Paint mPaintRect;
    private int mSquareColor;
    private int mSquareSize;
    private Paint mPaintCircle;
    private float mCircleX, mCircleY;
    private float mCircleRadius = 100f;

    public RectangleDemo(Context context) {
        super(context);
        init(null);
    }

    public RectangleDemo(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public RectangleDemo(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public RectangleDemo(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@NonNull AttributeSet attrs) {
        mSquareRect = new Rect();
        mPaintRect = new Paint(Paint.ANTI_ALIAS_FLAG);

        mPaintCircle = new Paint();
        mPaintCircle.setAntiAlias(true);

        mPaintCircle.setColor(Color.parseColor("#87BCD8"));

        if (attrs == null)
            return;

        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.RectangleDemo);

        mSquareColor = typedArray.getColor(R.styleable.RectangleDemo_squareColor, Color.RED);
        mSquareSize = typedArray.getDimensionPixelSize(R.styleable.RectangleDemo_squareSize, SQUARE_SIZE);

        mPaintRect.setColor(mSquareColor);

        typedArray.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mSquareRect.left = 50;
        mSquareRect.top = 50;
        mSquareRect.right = mSquareRect.left + mSquareSize;
        mSquareRect.bottom = mSquareRect.top + mSquareSize;

        canvas.drawRect(mSquareRect, mPaintRect);

        if (mCircleX == 0 || mCircleY == 0) {
            mCircleX = getWidth() / 2;
            mCircleY = getHeight() / 2;
        }

        canvas.drawCircle(mCircleX, mCircleY, mCircleRadius, mPaintCircle);
    }

    public void swipeColor() {
        mPaintRect.setColor(mPaintRect.getColor() == mSquareColor ? Color.RED : mSquareColor);
        postInvalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value = super.onTouchEvent(event);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {

                float x = event.getX();
                float y = event.getY();

                if (mSquareRect.left < x && mSquareRect.right > x)
                    if (mSquareRect.top < y && mSquareRect.bottom > y){
                        mCircleRadius += 10f;
                        postInvalidate();
                    }

                return true;
            }

            case MotionEvent.ACTION_MOVE: {

                float x = event.getX();
                float y = event.getY();

                double dx = Math.pow(x - mCircleX, 2);
                double dy = Math.pow(y - mCircleY, 2);

                if (dx + dy < Math.pow(mCircleRadius, 2)) {
                    // Touched
                    mCircleX = x;
                    mCircleY = y;
                    postInvalidate();
                    return true;
                }

                return value;
            }
        }

        return value;
    }
}
