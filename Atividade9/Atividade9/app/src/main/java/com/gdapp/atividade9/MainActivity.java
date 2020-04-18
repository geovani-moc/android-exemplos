package com.gdapp.atividade9;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private Random gerador;
    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gerador = new Random();
        texto = new TextView(this);
        texto.setText("Ir para activity aleatoria");
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = gerador.nextInt(3);
                Log.v("MainActivity", Integer.toString(numero));
                Intent intent;
                if (numero == 0) {
                    intent = new Intent(getApplicationContext(), Activity2.class);
                } else if (numero == 1) {
                    intent = new Intent(getApplicationContext(), Activity3.class);
                } else {
                    intent = new Intent(getApplicationContext(), Activity4.class);
                }
                startActivityForResult(intent, 0);
            }
        });


        setContentView(texto);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data != null)
        {
            String palavra = data.getExtras().getString("palavra");
            texto.setText("Palavra sorteada: " + palavra);
        }
    }
}
