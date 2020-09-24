package com.example.clay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RectangleDemo extends View {

    private static final int SQUARE_SIZE = 200;
    private Rect mSquareRect;
    private Paint mPaintRect;

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
        mPaintRect.setColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mSquareRect.left = 50;
        mSquareRect.top = 50;
        mSquareRect.right = mSquareRect.left + SQUARE_SIZE;
        mSquareRect.bottom = mSquareRect.top + SQUARE_SIZE;


        canvas.drawRect(mSquareRect, mPaintRect);
    }

    public void swipeColor() {
        mPaintRect.setColor(mPaintRect.getColor() == Color.RED ? Color.GREEN : Color.RED);
        postInvalidate();
    }
}
