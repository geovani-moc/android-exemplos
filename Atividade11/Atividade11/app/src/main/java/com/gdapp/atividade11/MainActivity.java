package com.gdapp.atividade11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonVerificar;
    private EditText editTextEntrada;
    private Integer resposta;
    private Intent intent;
    private Bundle bundle;
    private Integer numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVerificar = (Button) findViewById(R.id.buttonVerificar);
        editTextEntrada = (EditText) findViewById(R.id.entrada);
    }

    public void VerificarResposta(View view) {

        numero = (new Random().nextInt(10)) + 1;

        resposta = Integer.valueOf(editTextEntrada.getText().toString());
        bundle = new Bundle();

        bundle.putInt("numero", numero);
        bundle.putInt("entrada", resposta);

        intent = new Intent(getApplicationContext(), Resultado.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
