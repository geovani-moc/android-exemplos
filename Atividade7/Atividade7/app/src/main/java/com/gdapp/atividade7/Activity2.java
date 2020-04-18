package com.gdapp.atividade7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    TextView texto;
    String tag = "activity2";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(tag, "Iniciado o onCreate");

        final Intent intent = getIntent();
        Bundle budle = intent.getExtras();
        int numero = budle.getInt("numeroAleatorio");

        String resposta = Integer.toString(numero);

        texto = new TextView(this);
        texto.setText(resposta);

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        setContentView(texto);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(tag, "Iniciado o onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(tag, "Iniciado o onStop.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(tag, "Iniciado o onDestroy.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(tag, "Iniciado o onPause.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(tag, "Iniciado o onResume.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(tag, "Iniciado o onRestart.");
    }
}
