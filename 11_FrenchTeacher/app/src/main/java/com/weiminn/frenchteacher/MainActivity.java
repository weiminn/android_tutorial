package com.weiminn.frenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRed, btnBlue, btnGreen;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRed = findViewById(R.id.btn_red);
        btnBlue = findViewById(R.id.btn_blue);
        btnGreen = findViewById(R.id.btn_green);

//        btnRed.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MediaPlayer mediaPlayer = MediaPlayer.create(
//                        getApplicationContext(),
//                        R.raw.its_your_fault
//                );
//                mediaPlayer.start();
//            }
//        });

        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int clickedId = view.getId();

        if (clickedId == R.id.btn_red){
            linkAudio(R.raw.its_your_fault);
        } else if (clickedId == R.id.btn_blue) {
            linkAudio(R.raw.i_love_cheese);
        } else {
            linkAudio(R.raw.i_dont_speak_spanish);
        }

        mediaPlayer.start();
    }

    private void linkAudio(int id){
        if (mediaPlayer != null && mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        mediaPlayer = MediaPlayer.create(getApplicationContext(), id);
    }
}