package com.gdapp.atividade18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ANRTests Activity";
    private Button button;
    private int tempo;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_processar);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(10);
        progressBar.setProgress(0);

    }

    public void processar(View view) {
        Log.i(TAG, ">>> Clique [" + new Date().toString() + "]");
        Log.i(TAG, ">>> Processamento iniciado [" + new Date().toString() + "]");

        button.setEnabled(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Log.i(TAG, ">>> Contagem: " + i);
                    tempo = i;
                    try {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                progressBar.setProgress(tempo);
                            }
                        });

                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Log.e(TAG, "Falha na execução da thread.", ie);
                    }

                }

                Log.i(TAG, ">>> Processamento concluído [" + new Date().toString() + "]");

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setProgress(tempo+1);
                        button.setEnabled(true);
                    }
                });
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}