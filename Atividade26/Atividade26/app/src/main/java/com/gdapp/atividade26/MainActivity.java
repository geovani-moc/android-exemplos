package com.gdapp.atividade26;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mandaMenssagemBroadcast01(View view) {
        intent = new Intent("com.gdapp.BC01");
        bundle= new Bundle();
        bundle.putInt("numero", 101);
        intent.putExtras(bundle);

        sendBroadcast(intent);
    }

    public void mandaMenssagemBroadcast02(View view) {
        intent = new Intent("com.gdapp.BC02");
        bundle = new Bundle();
        bundle.putInt("numero2", 102);
        intent.putExtras(bundle);

        sendBroadcast(intent);
    }
}
