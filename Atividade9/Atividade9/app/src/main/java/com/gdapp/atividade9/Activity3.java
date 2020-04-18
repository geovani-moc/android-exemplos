package com.gdapp.atividade9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Activity3 extends AppCompatActivity {

    private TextView texto;
    private String palavras[] = {"mustang", "camaro", "911", "jetta", "cuda", "passat", "sonata", "model S", "Roadster", "f-150"};
    private Random gerador;
    private int numero;
    private String tag = "activity3";

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
