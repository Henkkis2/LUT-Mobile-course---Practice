package com.example.mandatorytasks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button SeconddAct;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeconddAct = (Button) findViewById(R.id.SecondActivity);
        SeconddAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Text.test", "123456 Hello World!");
                startActivity(intent);
            }
        });

        Button googleButton = (Button) findViewById(R.id.GoogleButton);
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "http://www.google.fi";
                System.out.println(google);
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });

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

        Button ListVieww = (Button) findViewById(R.id.ThirdButton);
        ListVieww.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListViewAct.class);
                startActivity(intent);
            }
        });
    }
}