package com.weiminn.adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. an list view to be dynamically populated using an adapter
        listView = findViewById(R.id.listView);

        // 2. data source (here is an static example, but almost always dynamic)
        String[] countries = {"USA", "Germany", "Canada", "Lituania", "Turkey"};

        // 3. adapter acts as a bridge between the data source and the adapter view
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_1,
//                countries
//        );

        MyCustomAdapter adapter = new MyCustomAdapter(
                this,
                countries
        );

        listView.setAdapter(adapter);
    }
}