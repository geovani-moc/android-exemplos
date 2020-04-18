package com.gdapp.atividade15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.xml.transform.sax.SAXResult;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;
    private Button button;
    private String nome;
    private Integer idade;
    private Double renda;
    private String sexo;
    private EditText editTextNome;
    private EditText editTextIdade;
    private EditText editTextRenda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonEnviar);
        editTextIdade = (EditText) findViewById(R.id.editIdade);
        editTextNome = (EditText) findViewById(R.id.editNome);
        editTextRenda = (EditText) findViewById(R.id.editRenda);

    }

    public void enviar(View view) {

        nome = editTextNome.getText().toString();
        idade = Integer.parseInt(editTextIdade.getText().toString());
        renda = Double.parseDouble(editTextRenda.getText().toString());

        if(sexo.isEmpty())
            sexo = "não selecionado";

        bundle = new Bundle();

        bundle.putInt("idade", idade.intValue() );
        bundle.putDouble("renda", renda.doubleValue());
        bundle.putString("nome", nome);
        bundle.putString("sexo", sexo);

        intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }

    public void radioMulher(View view) {
        sexo = new String("Feminino");
    }

    public void radioHomen(View view) {
        sexo = new String("Masculino");
    }
}
