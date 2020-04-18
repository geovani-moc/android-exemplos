package com.gdapp.atividade16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private static final String TAG = "ANRTests Activity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.texto);
        button = (Button) findViewById(R.id.btn_processar);

    }

    public void processar(View view) {
        Log.i(TAG, ">>> Clique [" + new Date().toString() + "]");
        textView.setText(R.string.processando);
        Log.i(TAG, ">>> Processamento iniciado [" + new Date().toString() + "]");

        button.setEnabled(false);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Log.i(TAG, ">>> Contagem: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ie) {
                        Log.e(TAG, "Falha na execução da thread.", ie);
                    }
                }

                Log.i(TAG, ">>> Processamento concluído [" + new Date().toString() + "]");

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(R.string.concluido);
                        button.setEnabled(true);
                    }
                });
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}