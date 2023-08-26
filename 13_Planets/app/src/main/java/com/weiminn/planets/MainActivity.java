package com.weiminn.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialDatePicker;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Planet> planetArrayList;

    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        planetArrayList = new ArrayList<>();

        planetArrayList.add(
                new Planet("Nikocado", 300, R.drawable.nikocado_face)
        );
        planetArrayList.add(
                new Planet("Nancy", 60, R.drawable.nancy)
        );
        planetArrayList.add(
                new Planet("Hungry Fat Chick", 150, R.drawable.hungry_fat_chick)
        );
        planetArrayList.add(
                new Planet("Oompaville", 80, R.drawable.oompa)
        );
        planetArrayList.add(
                new Planet("Papa Meat", 100, R.drawable.papa_meat)
        );

        adapter = new MyCustomAdapter(planetArrayList, getApplicationContext());

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(

                        // this refers to the same context as getContext
                        // getContext is not available because we are already inside the context!
                        MainActivity.this,

                        "Planet Name: " + adapter.getItem(position).getPlanetName(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }
}