package com.example.democustomlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.clay.RectangleDemo;

public class MainActivity extends AppCompatActivity {

    private RectangleDemo rectangleDemo;
    private Button buttonSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rectangleDemo = findViewById(R.id.rectangles);
        findViewById(R.id.btn_swap).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rectangleDemo.swipeColor();
            }
        });
    }
}