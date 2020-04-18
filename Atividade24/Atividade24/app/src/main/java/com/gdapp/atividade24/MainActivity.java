package com.gdapp.atividade24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irImplicita(View view) {
        Intent intent = new Intent("br.edu.ifnmg.ACTION1", Uri.parse("ifnmg://dataserver/id/100"));

        intent.addCategory("br.edu.ifnmg.PADRAO");

        startActivity(intent);
    }
}
