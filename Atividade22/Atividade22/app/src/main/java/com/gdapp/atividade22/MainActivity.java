package com.gdapp.atividade22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private EditText editTextTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
    }

    public void irTelefone(View view) {
        String telefone = "tel:" + editTextTelefone.getText().toString();
        intent = new Intent(Intent.ACTION_CALL, Uri.parse(telefone));
        startActivity(intent);
    }
}
