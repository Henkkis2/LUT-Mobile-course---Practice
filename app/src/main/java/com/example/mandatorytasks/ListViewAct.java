package com.example.mandatorytasks;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListViewAct extends AppCompatActivity {
    String[] items;
    String[] prices;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Resources res = getResources();
        ListView myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);
        prices = res.getStringArray(R.array.prices);
        descriptions = res.getStringArray(R.array.descriptions);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                System.out.println(i);

                if (i==0) {
                    Intent intent = new Intent(getApplicationContext(), peachAct.class);
                    intent.putExtra("Value", items[i]);
                    startActivity(intent);
                } else if (i==1) {
                    Intent intent = new Intent(getApplicationContext(), ImageView.class);
                    intent.putExtra("Value", items[i]);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getApplicationContext(), bananaAct.class);
                    intent.putExtra("Value", items[i]);
                    startActivity(intent);
                }
            }
        });

    }
}