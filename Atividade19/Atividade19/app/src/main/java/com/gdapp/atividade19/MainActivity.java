package com.gdapp.atividade19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ir1Handler(View view) {
        intent = new Intent(getApplicationContext(), Handler1.class);
        startActivity(intent);
    }

    public void irHandlerBundle(View view) {
        intent = new Intent(getApplicationContext(), HandlerBundle.class);
        startActivity(intent);
    }

    public void irSplashScreen(View view) {
        intent = new Intent(getApplicationContext(), SplashScreen.class);
        startActivity(intent);
    }

    public void irAsyncTask(View view) {
        intent = new Intent(getApplicationContext(), AsyncTaskActivity.class);
        startActivity(intent);
    }

    public void irhandleMessage(View view) {
        intent = new Intent(getApplicationContext(), MyHandlerMessageActivity.class);
        startActivity(intent);
    }
}
