package com.gdapp.atividade20;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class ContadorTempo  extends AsyncTask<Double, Double, Void > {

    private TextView textViewContador;
    private Button buttonContador;

    @Override
    protected Void doInBackground(Double... tempoInicial) {
        double tempo = tempoInicial[0];
        double precisao = tempoInicial[1];
        double i = 0f;
        
        while(i <= tempo)
        {
            try {
                Thread.sleep((int)(precisao*1000));
            }catch (InterruptedException e)
            {
                Log.e("contador", "falha no contador", e);
            }

            publishProgress(i);

            i+= precisao;
        }

        return null;
    }

    public ContadorTempo(TextView textViewContador, Button buttonContador) {
        super();
        this.textViewContador = textViewContador;
        this.buttonContador = buttonContador;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        buttonContador.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        buttonContador.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Double... tempoAtual) {
        super.onProgressUpdate(tempoAtual);

        textViewContador.setText(String.valueOf(tempoAtual[0]));
    }
}
