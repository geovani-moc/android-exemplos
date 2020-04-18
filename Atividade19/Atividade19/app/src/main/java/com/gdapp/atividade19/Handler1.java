package com.gdapp.atividade19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Handler1 extends AppCompatActivity {


    private TextView t;
    private Button b;

    private android.os.Handler h;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        t = (TextView) findViewById(R.id.textViewStado);
        b = (Button) findViewById(R.id.buttonProcessar);

        h = new android.os.Handler();
    }

    public void processar(View v) {

        t.setText(R.string.processando);
        b.setEnabled(false);

        Runnable r = new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < 11; i++) {
                    try {
                        Thread.sleep(1000);
                        Log.i(getString(R.string.first_handler_activity),
                                ">> " + (i + 1));
                    } catch (InterruptedException ie) {
                        Log.e(getString(R.string.first_handler_activity),
                                "Falha na thread", ie);
                    }
                }

                h.post(new Runnable() {

                    @Override
                    public void run() {

                        t.setText(R.string.concluido);
                        b.setEnabled(true);
                    }
                });
            }
        };


        Thread th = new Thread(r);
        th.start();
    }
}
