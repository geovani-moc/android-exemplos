package com.gdapp.atividade15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;

    private TextView textViewNome;
    private TextView textViewIdade;
    private TextView textViewrenda;
    private TextView textViewSexo;

    private String nome;
    private String sexo;
    private Integer idade;
    private Double renda;

    private String tag = "Activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        intent = getIntent();
        bundle = intent.getExtras();

        nome = bundle.getString("nome");
        sexo = bundle.getString("sexo");
        idade = bundle.getInt("idade");
        renda = bundle.getDouble("renda");

        Log.v(tag, "\nnome: " + nome +"\nsexo: " + sexo +"\nidade: " + idade +"\nrenda: " + renda);

        textViewIdade = (TextView) findViewById(R.id.textIdade);
        textViewNome = (TextView) findViewById(R.id.textNome);
        textViewrenda = (TextView) findViewById(R.id.textRenda);
        textViewSexo = (TextView) findViewById(R.id.textSexo);

        textViewNome.setText("Nome: " + nome);
        textViewSexo.setText("Sexo: " + sexo);
        textViewrenda.setText("Idade: " + idade.toString());
        textViewIdade.setText("Renda: " + renda.toString());
    }
}
