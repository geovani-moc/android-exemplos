package com.gdapp.atividadesms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DesarmarBomba extends AppCompatActivity {

    private EditText editTextDesarmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarmar_bomba);

        editTextDesarmar = (EditText) findViewById(R.id.editTextDesarmar);
    }

    public void irVerificarSenha(View view) {

        String senhaCorreta = ":-)";
        String senhaUsiario = editTextDesarmar.getText().toString();

        if(senhaCorreta.equals(senhaUsiario))
        {
            //desativar o alarme
            NotificationManager notificationManagerDesarmar = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
            notificationManagerDesarmar.cancel(99);
            finish();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "... você está sendo filmado!",Toast.LENGTH_SHORT).show();
        }

    }
}
