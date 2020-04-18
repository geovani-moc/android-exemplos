package com.gdapp.atividade19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AsyncTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
    }

    public void processar(View v) {
        TextView t = (TextView) findViewById(R.id.texto_async_task);
        Button b = (Button) findViewById(R.id.botao_async_task);

// Cria uma instância da CounterTask passando
// elementos gráficos a serem manipulados
        CounterTask ct = new CounterTask(t, b);

// Inicia a execução da tarefa assíncrona
        ct.execute(10);
    }
}
