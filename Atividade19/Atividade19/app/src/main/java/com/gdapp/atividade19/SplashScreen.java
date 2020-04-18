package com.gdapp.atividade19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity implements Runnable{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler h = new Handler();
        h.postDelayed(this, 4000);
    }

    @Override
    public void run() {
        Intent intent = new Intent(getApplicationContext(), Handler1.class);
        startActivity(intent);
        finish();
    }
}
