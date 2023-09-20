package com.example.mandatorytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("Text.test")) {
            TextView textV = (TextView) findViewById(R.id.textView2);
            String text = getIntent().getExtras().getString("Text.test");
            textV.setText(text);
        }
    }
}