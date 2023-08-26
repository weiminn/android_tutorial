package com.weiminn.volume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapesArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapesArrayList = new ArrayList<>();

        shapesArrayList.add(
                new Shape(
                        R.drawable.nikocado_face,
                        "Nikocado"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.amberlynn_reid,
                        "Amberlynn"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.hungry_fat_chick,
                        "Hungry"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.matt_stonie,
                        "matt"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nancy,
                        "Nancy"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.oompa,
                        "Oompa"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nikocado_face,
                        "Nikocado"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.amberlynn_reid,
                        "Amberlynn"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.hungry_fat_chick,
                        "Hungry"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.matt_stonie,
                        "matt"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nancy,
                        "Nancy"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.oompa,
                        "Oompa"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nikocado_face,
                        "Nikocado"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.amberlynn_reid,
                        "Amberlynn"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.hungry_fat_chick,
                        "Hungry"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.matt_stonie,
                        "matt"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nancy,
                        "Nancy"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.oompa,
                        "Oompa"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nikocado_face,
                        "Nikocado"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.amberlynn_reid,
                        "Amberlynn"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.hungry_fat_chick,
                        "Hungry"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.matt_stonie,
                        "matt"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nancy,
                        "Nancy"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.oompa,
                        "Oompa"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nikocado_face,
                        "Nikocado"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.amberlynn_reid,
                        "Amberlynn"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.hungry_fat_chick,
                        "Hungry"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.matt_stonie,
                        "matt"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.nancy,
                        "Nancy"
                )
        );

        shapesArrayList.add(
                new Shape(
                        R.drawable.oompa,
                        "Oompa"
                )
        );

        MyCustomAdapter adapter = new MyCustomAdapter(shapesArrayList, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setNumColumns(3);
    }
}