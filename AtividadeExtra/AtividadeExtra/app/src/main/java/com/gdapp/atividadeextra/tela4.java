package com.gdapp.atividadeextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class tela4 extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;
    private Cadastro cadastro;

    private TextView textNome;
    private TextView textCpf;
    private TextView textNascimento;
    private TextView textRg;

    private TextView textTipologradouro;
    private TextView textLogradouro;
    private TextView textNumero;
    private TextView textComplemento;
    private TextView textBairro;
    private TextView textCidade;
    private TextView textEstado;
    private TextView textCep;

    private TextView textTelefone1;
    private TextView textTelefone2;
    private TextView textEmail;
    private TextView textFacebook;
    private TextView textInstagram;
    private TextView textTwintter;

    private static final String tagCadastro = "Cadastro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4);

        textNome = findViewById(R.id.textNome);
        textCpf = findViewById(R.id.textCpf);
        textNascimento = findViewById(R.id.textNascimento);
        textRg = findViewById(R.id.textRg);

        textTipologradouro = findViewById(R.id.textTipoLogradouro);
        textLogradouro = findViewById(R.id.textLogradouro);
        textNumero = findViewById(R.id.textNumero);
        textComplemento = findViewById(R.id.textComplemeto);
        textBairro = findViewById(R.id.textBairro);
        textCidade = findViewById(R.id.textCidade);
        textEstado = findViewById(R.id.textEstado);
        textCep = findViewById(R.id.textCep);

        textTelefone1 = findViewById(R.id.textTelefone1);
        textTelefone2 = findViewById(R.id.textTelefone2);
        textEmail = findViewById(R.id.textEmail);
        textFacebook = findViewById(R.id.textFacebook);
        textInstagram = findViewById(R.id.textInstagram);
        textTwintter = findViewById(R.id.textTwintter);

        intent = getIntent();
        bundle = intent.getExtras();
        cadastro = (Cadastro) bundle.getSerializable(tagCadastro);

        verTela4Cadastro(cadastro);
    }

    private void verTela4Cadastro(Cadastro cadastro)
    {
        textNome.setText("nome: " + cadastro.getNome());
        textCpf.setText("CPF: " + cadastro.getCpf());
        textRg.setText("RG: " + cadastro.getRg());
        textNascimento.setText("Nascimento: " + cadastro.getNascimento());

        textTipologradouro.setText("Tipo Logradouro: " + cadastro.getTipoLogradouro());
        textLogradouro.setText("Logradouro: "+cadastro.getLogradouro());
        textNumero.setText("Número: "+cadastro.getNumero());
        textComplemento.setText("Complemento: "+ cadastro.getComplemento());
        textBairro.setText("Bairro: "+cadastro.getBairro());
        textCidade.setText("Cidade: "+ cadastro.getCidade());
        textEstado.setText("Estado: "+ cadastro.getEstado());
        textCep.setText("CEP: "+cadastro.getCep());

        textTelefone1.setText("Telefone 1: "+cadastro.getTelefone01());
        textTelefone2.setText("Telefone 2: "+cadastro.getTelefone02());
        textEmail.setText("Email: "+cadastro.getEmail());
        textFacebook.setText("Facebook: "+cadastro.getFacebook());
        textInstagram.setText("Instagram: "+cadastro.getInstagram());
        textTwintter.setText("Twintter: "+cadastro.getTwitter());
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putSerializable(tagCadastro, cadastro);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle outbundle) {
        outbundle.getSerializable(tagCadastro);
        super.onSaveInstanceState(outbundle);
    }

    public void buttonOk(View view) {
        intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
