package com.example.splashanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    public static final long SPLAH_SCREEN_DELAY = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //implementar tiempo
        TimerTask time = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent().setClass(MainActivity.this, Splash.class);
                startActivity(intent);
                finish();
            }
        };
        // se ejecuta una vez cerrado
        Timer timer = new Timer();
        timer.schedule(time,SPLAH_SCREEN_DELAY);
    }
}