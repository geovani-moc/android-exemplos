package com.gdapp.atividade12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double numero1;
    private Double numero2;
    private Double resultado;

    private Button soma;
    private Button sub;
    private Button mult;
    private Button divisao;

    private TextView resposta;

    private EditText editNumero1;
    private EditText editNumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumero1 = (EditText) findViewById(R.id.numero1);
        editNumero2 = (EditText) findViewById(R.id.numero2);

        soma = (Button) findViewById(R.id.soma);
        sub = (Button) findViewById(R.id.subtracao);
        divisao = (Button) findViewById(R.id.divisao);
        mult = (Button) findViewById(R.id.multiplicacao);

        resposta = (TextView) findViewById(R.id.resposta);

    }

    public void somar(View view) {
        numero1 = Double.parseDouble(editNumero1.getText().toString());
        numero2 = Double.parseDouble(editNumero2.getText().toString());
        resultado = numero1 + numero2;

        resposta.setText(resultado.toString());
    }

    public void subtrair(View view) {
        numero1 = Double.parseDouble(editNumero1.getText().toString());
        numero2 = Double.parseDouble(editNumero2.getText().toString());
        resultado = numero1 - numero2;

        resposta.setText(resultado.toString());
    }

    public void multiplicar(View view) {
        numero1 = Double.parseDouble(editNumero1.getText().toString());
        numero2 = Double.parseDouble(editNumero2.getText().toString());
        resultado = numero1 * numero2;

        resposta.setText(resultado.toString());
    }

    public void dividir(View view) {
        numero1 = Double.parseDouble(editNumero1.getText().toString());
        numero2 = Double.parseDouble(editNumero2.getText().toString());
        resultado = (double)numero1 / (double)numero2;

        resposta.setText(resultado.toString());
    }
}
