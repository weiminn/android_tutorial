package com.weiminn.worldcup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] worldCup22 = {
            "Germany",
            "Spain",
            "Ingerland",
            "USA",
            "Saudi Arabia",
            "Ecuador",
            "Japan",
            "Senegal"
    };

    // simple adapter with straightforward datatypes for items
    ArrayAdapter<String> adapter;

    // custom adapter with custom model for custom dataformat
    CustomAdapter customAdapter;
    ArrayList<CountryModel> countries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(

                // this,
                getApplicationContext(), // "this" also refers to the application context

                // android.R.layout.simple_list_item_1, // simple list item layout provided by android
                R.layout.list_item, // custom layout, baby!
                R.id.textView, // specify the TextView in the custom layout (quite limited, no?)

                worldCup22 // array of straightforward datatype
        );
//        listView.setAdapter(adapter);

        //populate datasource first

        countries.add(new CountryModel("Engerland", "1", R.drawable.england));
        countries.add(new CountryModel("Messiland", "3", R.drawable.argentina));
        countries.add(new CountryModel("Buttlift", "7", R.drawable.brazil));
        countries.add(new CountryModel("Sausage", "5", R.drawable.germany));
        countries.add(new CountryModel("ArsenalFans", "0", R.drawable.ghana));
        countries.add(new CountryModel("Sushiland", "3", R.drawable.japan));
        countries.add(new CountryModel("KimChi", "2", R.drawable.korea));
        countries.add(new CountryModel("USA", "1", R.drawable.usa));

        customAdapter = new CustomAdapter(
                countries,
                getApplicationContext()
        );
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "Country " + customAdapter.getItem(position).getCountryName() +
                                " has won the world cup " +
                                customAdapter.getItem(position).getCupWinCount() + " times!",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}