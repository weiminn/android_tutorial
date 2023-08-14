package com.weiminn.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Intents facilitates communication between different components of an app, as well as
        // communication between different applications

        // types of intent:
        // 1. explicit intents: dealing with other components from same app
        // 2. implicit intents: dealing with other components from other apps

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoSecondActivity();
            }
        });

        Button openBrowserBtn = findViewById(R.id.openBrowser);
        openBrowserBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage();
            }
        });
    }

    public void gotoSecondActivity(){
        // explicit cos it's navigating to another component
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void openWebPage(){
        // implicit cos launching an external browser
        Uri webpage = Uri.parse("https://notoriouskkk.ytmnd.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);

    }
}