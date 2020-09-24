package com.example.clay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class ButtonText extends View {

    public ButtonText(Context context) {
        super(context);
        init(null);
    }

    public ButtonText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public ButtonText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public ButtonText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
//        LinearLayout linearLayout = new LinearLayout(context);
//        LayoutParams layoutParams = new LayoutParams(
//                LayoutParams.WRAP_CONTENT,
//                LayoutParams.WRAP_CONTENT
//        );
//
//        linearLayout.setLayoutParams(layoutParams);
//
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//
//        linearLayout.setBackgroundColor(context.getColor(android.R.color.holo_green_dark));
//
//        Button button = new Button(context);
//        button.setText("Button");
//        button.setLayoutParams(layoutParams);
//
//
//        TextView textView = new TextView(context);
//        textView.setText("Text");
//        textView.setLayoutParams(layoutParams);
//
//        linearLayout.addView(button);
//        linearLayout.addView(textView);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
    }
}
