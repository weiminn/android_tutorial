package com.weiminn.applifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // initialization tasks for event handlers and variables
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,
                "onCreate() is called",
                Toast.LENGTH_SHORT).show();
    }

    // when activity is visible but not yet interactive
    // can start animations and stuffs
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,
                "onStart() is called",
                Toast.LENGTH_SHORT).show();
    }

    // when activity comes back to foreground
    // start sensors and update location
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,
                "onResume() is called",
                Toast.LENGTH_SHORT).show();
    }

    // activity is losing focus
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,
                "onPause() is called",
                Toast.LENGTH_SHORT).show();
    }

    // release resources, save data, close connections
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,
                "onStop() is called",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,
                "onRestart() is called",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,
                "onDestroy() is called",
                Toast.LENGTH_SHORT).show();
    }
}