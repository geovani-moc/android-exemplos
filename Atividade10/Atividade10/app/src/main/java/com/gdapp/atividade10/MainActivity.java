package com.gdapp.atividade10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Double imc;
    private Double peso;
    private Double altura;

    private Button botaoCalcular;
    private TextView textViewResposta;
    private EditText editTextPeso;
    private EditText editTextAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoCalcular = (Button) findViewById(R.id.buttonCalcular);
        textViewResposta = (TextView) findViewById(R.id.textImc);
        editTextAltura = (EditText) findViewById(R.id.editAltura);
        editTextPeso = (EditText) findViewById(R.id.editPeso);

    }

    public void calcularImc(View view) {

        peso = Double.valueOf(editTextPeso.getText().toString());
        altura = Double.parseDouble(editTextAltura.getText().toString());

        imc = peso / (altura * altura);

        if(imc < 18.5 )
        {
            textViewResposta.setText("Subnutrição ou abaixo do peso ideal");
        }else if(imc < 25)
        {
            textViewResposta.setText("Saudável");
        }else if(imc < 30)
        {
            textViewResposta.setText("Sobrepeso");
        }else if (imc < 35)
        {
            textViewResposta.setText("Obsedade moderada");
        }else if(imc < 40)
        {
            textViewResposta.setText("Obesidade clínica");
        }else
        {
            textViewResposta.setText("Obesidade mórbida");
        }

    }

}
