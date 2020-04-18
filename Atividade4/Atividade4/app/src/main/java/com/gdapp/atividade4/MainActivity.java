package com.gdapp.atividade4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private String msg = "clique para novo Sortei.\n";
    private String tag = "MainActivity";
    private String resposta;
    private Random gerador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gerador = new Random();

        texto = new TextView(this);
        texto.setText(msg);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resposta = "";
                for (int indice = 0; indice < 6; ++indice)
                {
                    resposta += Integer.toString(gerador.nextInt(60)+1) + "\n";
                }
                Log.d(tag, resposta);
                texto.setText(msg + resposta);
            }
        });

        setContentView(texto);

    }
}
