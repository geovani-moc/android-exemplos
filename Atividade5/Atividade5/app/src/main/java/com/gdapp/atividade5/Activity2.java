package com.gdapp.atividade5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private String tag = "acitivity2";

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(tag, "iniciado o onRestart.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(tag, "iniciado o onStart.");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(tag, "iniciado o onStop.");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(tag, "iniciado o onDestroy.");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(tag, "iniciado o onPause.");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(tag, "iniciado o onResume. ");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button botao2 = new Button(this);
        botao2.setText("Ir para a activity 1");
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        setContentView(botao2);
    }
}
