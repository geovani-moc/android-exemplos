package com.gdapp.atividade11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;
    private Integer entrada;
    private Integer numero;
    private ImageView imageView;
    private TextView textView;
    private String tag = "resultado";
    private EditText editText;
    private Button button;
    private Button buttonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageView = (ImageView) findViewById(R.id.imageViewResposta);
        textView = (TextView) findViewById(R.id.textViewResposta);
        button = (Button) findViewById(R.id.buttonTentar);
        editText = (EditText) findViewById(R.id.editTextNovaEntrada);
        buttonSair = (Button) findViewById(R.id.buttonSair);

        intent = getIntent();
        bundle = intent.getExtras();
        numero = bundle.getInt("numero");
        entrada = bundle.getInt("entrada");

        Log.v(tag, R.string.numeroSorteado + numero.toString() + R.string.eSuaEscolha + entrada.toString());

        if(numero.equals(entrada))
        {
            textView.setText(R.string.parabens);
        }else
        {
            imageView.setImageResource(R.mipmap.negativo);
            textView.setText(R.string.errou);

            editText.setVisibility(View.VISIBLE);
            button.setVisibility(View.VISIBLE);
            buttonSair.setVisibility(View.VISIBLE);

        }
    }

    public void tentarNovamente(View view) {

        entrada = Integer.valueOf(editText.getText().toString());
        Log.v(tag, R.string.numeroSorteado + numero.toString() + R.string.eSuaEscolha + entrada.toString());

        if(numero.equals(entrada))
        {
            editText.setVisibility(View.INVISIBLE);
            button.setVisibility(View.INVISIBLE);
            buttonSair.setVisibility(View.INVISIBLE);

            textView.setText(R.string.parabens);
            imageView.setImageResource(R.mipmap.positivo);
        }else
        {
            editText.setText("");
        }

    }

    public void sair(View view) {
        finishAffinity();
    }
}
