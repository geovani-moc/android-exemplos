package com.gdapp.atividade21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irTela01(View view) {
        intent = new Intent("com.gdaap.tela01");
        startActivity(intent);
    }

    public void irTela02(View view) {
        startActivity(new Intent("com.gdaap.tela02"));
    }

    public void irTela03(View view) {
        startActivity(new Intent("com.gdaap.tela03"));
    }

    public void irTela04(View view) {
        intent = new Intent("com.gdaap.tela04");
        startActivity(intent);
    }

    public void irTela05(View view) {
        intent = new Intent("com.gdaap.tela05");
        startActivity(intent);
    }

    public void irTela06(View view) {
        intent = new Intent("com.gdaap.tela06");
        startActivity(intent);
    }

    public void irTela07(View view) {
        intent = new Intent("com.gdaap.tela07");
        startActivity(intent);
    }

    public void irTela08(View view) {
        intent = new Intent("com.gdaap.tela08");
        startActivity(intent);
    }

    public void irTela09(View view) {
        intent = new Intent("com.gdaap.tela09");
        startActivity(intent);
    }

    public void irTela10(View view) {
        intent = new Intent("com.gdaap.tela10");
        startActivity(intent);
    }
}
