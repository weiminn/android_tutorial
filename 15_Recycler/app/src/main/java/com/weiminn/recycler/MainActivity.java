package com.weiminn.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Item> items;
    MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        items = new ArrayList<>();
        items.add(new Item(
                R.drawable.amberlynn_reid,
                "Fruits",
                "Fresh fruits from the garden"
        ));
        items.add(new Item(
                R.drawable.burger,
                "Burger",
                "borger"
        ));
        items.add(new Item(
                R.drawable.hungry_fat_chick,
                "Hungry Fat Chick",
                "She's hungry; she's fat; she's a chick."
        ));
        items.add(new Item(
                R.drawable.matt_stonie,
                "Matt Stonie",
                "Competitive eater"
        ));
        items.add(new Item(
                R.drawable.nancy,
                "Nancy",
                "Lawyer"
        ));
        items.add(new Item(
                R.drawable.nikocado_face,
                "Nikocado Avocado",
                "It's your fault!"
        ));
        items.add(new Item(
                R.drawable.amberlynn_reid,
                "Fruits",
                "Fresh fruits from the garden"
        ));
        items.add(new Item(
                R.drawable.burger,
                "Burger",
                "borger"
        ));
        items.add(new Item(
                R.drawable.hungry_fat_chick,
                "Hungry Fat Chick",
                "She's hungry; she's fat; she's a chick."
        ));
        items.add(new Item(
                R.drawable.matt_stonie,
                "Matt Stonie",
                "Competitive eater"
        ));
        items.add(new Item(
                R.drawable.nancy,
                "Nancy",
                "Lawyer"
        ));
        items.add(new Item(
                R.drawable.nikocado_face,
                "Nikocado Avocado",
                "It's your fault!"
        ));

        // pass in current activity
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        myCustomAdapter = new MyCustomAdapter(getApplicationContext(),  items);
        recyclerView.setAdapter(myCustomAdapter);

    }


}