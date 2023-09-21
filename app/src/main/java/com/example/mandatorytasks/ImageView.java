package com.example.mandatorytasks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ImageView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        if (getIntent().hasExtra("Value")) {
            TextView textV = (TextView) findViewById(R.id.textView3);
            String text = getIntent().getExtras().getString("Value");
            textV.setText(text);

        }
    }
}