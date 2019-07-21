package com.example.tomas.sounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void PlayWakeTheFuckUp(View view) {
        stop();
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wake_the_fuck_up_samurai);
        mediaPlayer.start();
    }

    public void PlayKurwa(View view) {
        stop();
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o_kurwa);
        mediaPlayer.start();
    }

    public void PlayWypierdalaj(View view) {
        stop();
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wypierdalac);
        mediaPlayer.start();
    }

    private void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}

