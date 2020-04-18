package com.gdapp.atividadeextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;
    private Cadastro cadastro;

    private EditText editNome;
    private EditText editRg;
    private EditText editCpf;
    private EditText editNascimento;

    private static final String tagCadastro = "Cadastro";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cadastro = new Cadastro();
        bundle = new Bundle();

        editCpf = findViewById(R.id.editCpf);
        editNome = findViewById(R.id.editNome);
        editRg = findViewById(R.id.editRg);
        editNascimento = findViewById(R.id.editNascimento);

        // para a mascara foi utilizado o projeto open source MaskFormatter
        // que pode ser acessado por https://github.com/rtoshiro/MaskFormatter

        SimpleMaskFormatter formatoCpf = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        MaskTextWatcher verificadorCpf = new MaskTextWatcher(editCpf, formatoCpf);
        editCpf.addTextChangedListener(verificadorCpf);

        SimpleMaskFormatter formatoNascimento = new SimpleMaskFormatter("NN/NN/NNNN");
        MaskTextWatcher verificadorNascimento = new MaskTextWatcher(editNascimento, formatoNascimento);
        editNascimento.addTextChangedListener(verificadorNascimento);

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


    public void irTela2(View view) {

        intent = new Intent(getApplicationContext(), tela2.class);

        lerTela1Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);

        startActivity(intent);

    }

    public void irTela3(View view) {
        intent = new Intent(getApplicationContext(), tela3.class);

        lerTela1Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);

        startActivity(intent);
    }

    public void irTela4(View view) {
        intent = new Intent(getApplicationContext(), tela4.class);

        lerTela1Cadastro(cadastro);

        bundle.putSerializable(tagCadastro, cadastro);
        intent.putExtras(bundle);

        startActivity(intent);
    }

    private void lerTela1Cadastro(Cadastro cadastro)
    {
        cadastro.setNome(editNome.getText().toString());
        cadastro.setCpf(editCpf.getText().toString());
        cadastro.setRg(verificarConverter(editRg.getText().toString()));
        cadastro.setNascimento(editNascimento.getText().toString());
    }

    private Integer verificarConverter(String palavra)
    {
        if(palavra.equals(""))
            return null;
        return Integer.valueOf(palavra);
    }
}
