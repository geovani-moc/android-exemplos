package com.gdapp.atividade19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyHandlerMessageActivity extends AppCompatActivity {

    // Permite referências em qualquer ponto da classe
    private TextView t;
    private Button b;

    // Handler processará dentro da UI Thread,
// pois está sendo declaro no fluxo da UI Thread
    private MyHandlerMessage myHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_message);

// Cria referência a componentes definidas no layout
        t = findViewById(R.id.texto_my_handler_message);
        b = findViewById(R.id.botao_my_handler_message);

// Instancia o handler
        myHandler = new MyHandlerMessage(t, b);
    }

    public void processar(View v) {

// Indica o início do processamento
        t.setText(R.string.processando);

// Impede novos lançamentos enquanto
// processamento não finalizar
        b.setEnabled(false);

// Define o que deve ocorrer no novo
// fluxo a ser criado
        Runnable r = new Runnable() {

            @Override
            public void run() {

// Simula processamento lento
                for (int i = 0; i < 11; i++) {
                    try {
                        Thread.sleep(1000);
                        Log.i(getString(R.string.first_handler_activity),
                                ">> " + (i +1));
                    } catch (InterruptedException ie) {
                        Log.e("ANRTestActivity",
                                "Falha na thread", ie);
                    }
                }

// Cria uma mensagem para ser passada ao MyHandler
// informado o que (what) deve ser feito.
// obtain() é mais eficiente do que new Message()
                Message m = Message.obtain();
                m.what = MyHandlerMessage.ATUALIZAR;

// Envia a mensagem para processamento
                myHandler.sendMessage(m);
            }
        };

// Após definições, cria um novo fluxo
// que executará o Runnable r
        Thread th = new Thread(r);

// Inicia a execução do novo fluxo
        th.start();
    }
}
