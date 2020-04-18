package com.gdapp.atividade8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView texto;
    private String tag = "activity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        texto = new TextView(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        int operando1 = bundle.getInt("operando1");
        int operando2 = bundle.getInt("operando2");
        int operacao = bundle.getInt("operacao");
        double calculo = 0;

        Log.v(tag, operacao + " " + operando1 + " " +operando2);

        String resposta = Integer.toString(operando1);

        if(operacao == 0)
        {
            calculo = operando1 + operando2;
            resposta += " + ";
        }else if (operacao == 1)
        {
            calculo = operando1 - operando2;
            resposta += " - ";
        }else if (operacao == 2)
        {
            calculo = operando1 * operando2;
            resposta += " * ";
        }else if (operacao == 3)
        {
            calculo = (double) operando1 / operando2;
            resposta += " / ";
        }

        resposta += Integer.toString(operando2) + " = " + Double.toString(calculo);
        Log.v(tag, resposta);

        texto.setText(resposta);

        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        setContentView(texto);

    }
}
