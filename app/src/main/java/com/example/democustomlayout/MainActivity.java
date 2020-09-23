package com.example.democustomlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.clay.ButtonText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonText buttonText = new ButtonText(this);

    }
}