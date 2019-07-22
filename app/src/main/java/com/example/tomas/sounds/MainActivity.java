package com.example.tomas.sounds;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setStatusBarTranslucent();
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

    public void stop() {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    protected void setStatusBarTranslucent() {
        window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    }

}

