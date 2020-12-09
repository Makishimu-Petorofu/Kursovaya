package com.example.kursovaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Load extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        Timer Timer = new Timer();
        TimerTask task = new TimerTask()
        {
            public void run(){
                Intent intent2 = new Intent(Load.this, MainActivity.class);
                startActivity(intent2);
            }
        };
        Timer.schedule(task, 3500L);
    }
}