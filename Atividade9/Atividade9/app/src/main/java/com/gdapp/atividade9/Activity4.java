package com.gdapp.atividade9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Activity4 extends AppCompatActivity {

    private TextView texto;
    private String palavras[] = {"carro", "moto", "avião", "barco", "navio", "triciclo", "monociclo", "submarino", "foguete", "bicicleta"};
    private Random gerador;
    private int numero;
    private String tag ="activity4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gerador = new Random();
        texto = new TextView(this);
        numero = gerador.nextInt(10);
        texto.setText(palavras[numero]);
        Log.v(tag, palavras[numero]);

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle bundle = new Bundle();
                bundle.putString("palavra",palavras[numero]);
                Intent intent = getIntent();
                intent.putExtras(bundle);

                setResult(0, intent);
                finish();
            }
        });

        setContentView(texto);
    }
}
