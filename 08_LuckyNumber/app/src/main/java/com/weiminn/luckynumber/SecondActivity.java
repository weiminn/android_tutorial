package com.weiminn.luckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView luckyNumberText;
    Button shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        luckyNumberText = findViewById(R.id.luckyNumber);
        shareBtn = findViewById(R.id.btnShare);

        int rand = (new Random()).nextInt(100);
        luckyNumberText.setText("" + rand);

        // Receiving data from previous Activity
        Intent i = getIntent();
        String userName = i.getStringExtra("name");

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName, rand);
            }
        });
    }

    public void shareData(String username, int rand){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT, username + "got lucky today!");
        i.putExtra(Intent.EXTRA_TEXT, "His lucky number is " + rand);
        startActivity(Intent.createChooser(i, "Choose a platform"));
    }

}