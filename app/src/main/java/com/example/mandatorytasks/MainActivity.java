package com.example.mandatorytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.button);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
                EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
                TextView textView = (TextView) findViewById(R.id.textView);

                int num1 = Integer.parseInt(editTextNumber.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int result = num1 + num2;
                textView.setText("Result: " + result);
            }
        });
    }
}