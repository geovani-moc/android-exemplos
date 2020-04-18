package com.gdapp.atividade27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irBroadCasts(View view) {

        Intent intent = new Intent("com.gdapp.BC");
        sendOrderedBroadcast(intent, null);

    }
}
