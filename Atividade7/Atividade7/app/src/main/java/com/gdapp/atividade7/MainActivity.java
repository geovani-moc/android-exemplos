package com.gdapp.atividade7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button botao;
    String tag = "mainActivity";

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(tag, "Iniciado o onCreate");

        botao = new Button(this);
        botao.setText("Ir para activity 2");

        final Bundle bundle = new Bundle();
        bundle.putInt("numeroAleatorio", (new Random()).nextInt());

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        setContentView(botao);

    }
}
