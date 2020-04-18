package com.gdapp.atividadeextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class tela2 extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;
    private Cadastro cadastro;

    private Spinner spinnerTipoLogradouro;
    private EditText editTextLogradouro;
    private EditText editTextNumero;
    private EditText editTextComplemento;
    private EditText editTextBairro;
    private EditText editTextCidade;
    private EditText editTextEstado;
    private EditText editTextCep;

    private static final String tagCadastro = "Cadastro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        intent = getIntent();
        bundle = intent.getExtras();
        cadastro = (Cadastro) bundle.getSerializable(tagCadastro);

        spinnerTipoLogradouro = findViewById(R.id.spinnerTipoLogradouro);
        editTextLogradouro = findViewById(R.id.editLogradouro);
        editTextNumero = findViewById(R.id.editNumero);
        editTextComplemento = findViewById(R.id.editComplemeto);
        editTextBairro = findViewById(R.id.editBairro);
        editTextCidade = findViewById(R.id.editCidade);
        editTextEstado = findViewById(R.id.editEstado);
        editTextCep = findViewById(R.id.editCEP);


        ArrayAdapter<CharSequence> tiposLogradouro = ArrayAdapter.createFromResource(this,
                R.array.TiposLogradouro, android.R.layout.simple_spinner_dropdown_item);
        tiposLogradouro.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTipoLogradouro.setAdapter(tiposLogradouro);

        spinnerTipoLogradouro.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                cadastro.setTipoLogradouro((String)spinnerTipoLogradouro.getSelectedItem());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        intent = getIntent();
        bundle = intent.getExtras();
        cadastro = (Cadastro) bundle.getSerializable(tagCadastro);
    }

    public void irTela3(View view) {

        intent = new Intent(getApplicationContext(), tela3.class);

        lerTela2Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void irTela4(View view) {

        intent = new Intent(getApplicationContext(), tela4.class);

        lerTela2Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void irTela1(View view) {
        intent = new Intent(getApplicationContext(), MainActivity.class);

        lerTela2Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    private void lerTela2Cadastro(Cadastro cadastro)
    {
        cadastro.setLogradouro(editTextLogradouro.getText().toString());
        cadastro.setNumero(verificarConverter(editTextNumero.getText().toString()));
        cadastro.setComplemento(editTextComplemento.getText().toString());
        cadastro.setBairro(editTextBairro.getText().toString());
        cadastro.setCidade(editTextCidade.getText().toString());
        cadastro.setEstado(editTextEstado.getText().toString());
        cadastro.setCep(verificarConverter(editTextCep.getText().toString()));
    }

    private Integer verificarConverter(String palavra)
    {
        if(palavra.equals(""))
            return null;
        return Integer.valueOf(palavra);
    }

}
