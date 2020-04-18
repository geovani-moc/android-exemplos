package com.gdapp.atividade20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonIniciar;
    private TextView textViewTempo;
    private ContadorTempo contadorTempo;
    private EditText editPrecisao;
    private EditText editTempoMaximo;
    private Double tempoMaximo;
    private Double precisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTempo = findViewById(R.id.textTempo);
        editPrecisao = findViewById(R.id.editTextTempoPrecisao);
        editTempoMaximo = findViewById(R.id.editTextTempoPersonalizado);
        buttonIniciar = findViewById(R.id.buttonIniciar);

    }

    public void iniciarCronometro(View view) {
        //pernalizavel em tempo = precisao do cronometro ex: cada atualização a 0.1s, 1s, 0.5s
        precisao = Double.valueOf(editPrecisao.getText().toString());
        tempoMaximo = Double.valueOf(editTempoMaximo.getText().toString());

        contadorTempo = new ContadorTempo(textViewTempo, buttonIniciar);
        contadorTempo.execute(tempoMaximo, precisao);
    }


}
