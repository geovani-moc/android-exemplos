package com.gdapp.atividade3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    private String msn = "Clique para gerar novo valor aleatorio.\n";
    private int numero;
    private String tag = "numero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        texto = new TextView(this);
        texto.setText(msn);
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero = (new Random()).nextInt(99) + 1;
                Log.d(tag, Integer.toString(numero));
                texto.setText(msn + numero);
            }
        });

        setContentView(texto);
    }
}
