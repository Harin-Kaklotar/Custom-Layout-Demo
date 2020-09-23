package com.example.clay;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ButtonText extends LinearLayout {
    public ButtonText(Context context) {
        super(context);
    }

    public ButtonText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT
        );

        linearLayout.setLayoutParams(layoutParams);

        linearLayout.setOrientation(LinearLayout.VERTICAL);

        linearLayout.setBackgroundColor(context.getColor(android.R.color.holo_green_dark));

        Button button = new Button(context);
        button.setText("Button");
        button.setLayoutParams(layoutParams);


        TextView textView = new TextView(context);
        textView.setText("Text");
        textView.setLayoutParams(layoutParams);

        linearLayout.addView(button);
        linearLayout.addView(textView);

    }

    public ButtonText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ButtonText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
