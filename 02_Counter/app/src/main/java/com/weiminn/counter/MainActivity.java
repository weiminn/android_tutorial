package com.weiminn.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView welcomeText, counterText;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.clickMe);
        counterText = findViewById(R.id.counterText);
        welcomeText = findViewById(R.id.welcomeText);

        // Adding the functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterText.setText(""+increaseCounter());
            }
        });
    }

    public int increaseCounter() {
        return ++counter;
    }
}