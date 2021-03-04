package com.am.pankajfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mediaPlayer=MediaPlayer.create(MainActivity2.this,R.raw.vizhi);
        
    }

    public void plyy(View view) {
        mediaPlayer.start();
    }

    public void pau(View view) {
        mediaPlayer.pause();
    }

    public void stp(View view) {
        mediaPlayer.stop();
        mediaPlayer=MediaPlayer.create(MainActivity2.this,R.raw.vizhi);

    }
}