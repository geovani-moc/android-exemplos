package com.gdapp.atividade6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class Activity2 extends AppCompatActivity {

    private  String tag = "activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(tag, "iniciado o onCreate");

        Random gerador = new Random();
        setResult(gerador.nextInt(1000));
        finish();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(tag, "iniciado o onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(tag, "iniciado o onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(tag, "iniciado o onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(tag, "iniciado o onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(tag, "iniciado o onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(tag, "iniciado o onRestart.");
    }
}
