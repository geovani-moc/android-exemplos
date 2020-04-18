package com.gdapp.atividade6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private  String textoBotao = "clique para gerar novo numero aleatorio";
    static final int identificacaoRetornoNumeroAleatorio = 1;
    private Button botao;
    private String tag = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(tag, "iniciado o onCreate");

        botao = new Button(this);
        botao.setText(textoBotao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), Activity2.class);
                startActivityForResult(intent, identificacaoRetornoNumeroAleatorio);
            }
        });
        setContentView(botao);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        botao.setText(String.valueOf(resultCode) + "\n" + textoBotao);
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
