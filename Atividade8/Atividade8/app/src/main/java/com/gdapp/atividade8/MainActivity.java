package com.gdapp.atividade8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private Random gerador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gerador = new Random();

        final Bundle bundle = new Bundle();
        bundle.putInt("operacao", gerador.nextInt(4));
        bundle.putInt("operando1", gerador.nextInt(100));
        bundle.putInt("operando2", gerador.nextInt(100));

        botao = new Button(this);
        botao.setText("Ir para activity 2." );
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
