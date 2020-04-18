package com.gdapp.atividade2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String tag = "MainActivity";

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
        Log.v(tag, "iniciado o onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(tag, "iniciado o onCreate");

        setContentView(R.layout.activity_main);
    }
}
