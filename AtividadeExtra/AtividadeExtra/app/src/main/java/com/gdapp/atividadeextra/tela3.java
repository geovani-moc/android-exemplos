package com.gdapp.atividadeextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class tela3 extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;
    private Cadastro cadastro;

    private EditText editTextTelefone1;
    private EditText editTextTelefone2;
    private EditText editTextEmail;
    private EditText editTextFacebook;
    private EditText editTextInstagram;
    private EditText editTextTwintter;

    private static final String tagCadastro = "Cadastro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        editTextTelefone1 = findViewById(R.id.editTelefone1);
        editTextTelefone2 = findViewById(R.id.editTelefone2);
        editTextEmail = findViewById(R.id.editEmail);
        editTextFacebook = findViewById(R.id.editFacebook);
        editTextInstagram = findViewById(R.id.editInstagram);
        editTextTwintter = findViewById(R.id.editTwintter);

        intent = getIntent();
        bundle = intent.getExtras();
        cadastro = (Cadastro) bundle.getSerializable(tagCadastro);
    }

    public void irTela4(View view) {

        intent = new Intent(getApplicationContext(), tela4.class);

        lerTela3Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void irTela1(View view) {
        intent = new Intent(getApplicationContext(), MainActivity.class);

        lerTela3Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void irTela2(View view) {
        intent = new Intent(getApplicationContext(), tela2.class);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void lerTela3Cadastro(Cadastro cadastro)
    {
        cadastro.setTelefone01(verificarConverter(editTextTelefone1.getText().toString()));
        cadastro.setTelefone02(verificarConverter(editTextTelefone2.getText().toString()));
        cadastro.setEmail(editTextEmail.getText().toString());
        cadastro.setFacebook(editTextFacebook.getText().toString());
        cadastro.setInstagram(editTextInstagram.getText().toString());
        cadastro.setTwitter(editTextTwintter.getText().toString());
    }

    private Integer verificarConverter(String palavra)
    {
        if(palavra.equals(""))
            return null;
        return Integer.valueOf(palavra);
    }
}
