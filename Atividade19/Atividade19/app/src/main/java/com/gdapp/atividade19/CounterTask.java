package com.gdapp.atividade19;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

// Parâmetros:
// 1. Inicialização: tipo de dado enviado no início da execução da tarefa
// 2. Progresso : tipo de dado publicado durante a durante o processamento em segundo plano
// 3. Resultado : tipo de dado retornado como resultado do processamento
public class CounterTask extends AsyncTask<Integer, Integer, Void> {

    private TextView t;
    private Button b;

    public CounterTask(TextView t, Button b) {
        super();
        this.t = t;
        this.b = b;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

// Processamento executado antes de iniciar-se a tarefa
        b.setEnabled(false);
    }

    /**
     * @param result (3) Resultado
     */
    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);

// Processamento executado ao final da tarefa
        b.setEnabled(true);
    }

    /**
     * @param values (2) Progresso
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

// Invocado para fazer atualização da UI
// durante o processamento
        t.setText(String.valueOf(values[0]));
    }

    /**
     * @param arg0 (1) Inicialização. Passado pelo excute(...)
     */
    @Override
    protected Void doInBackground(Integer... arg0) {

// Processamento em segundo plano
// Executa fora da UI Thread
        int n = arg0[0];
        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Log.e("CounterTask", "Falha em pausar a thread", ie);
            }

// Invocação indireta de onProgressUpdate(Integer... values)
            publishProgress(i);
        }

        return null;
    }
}
