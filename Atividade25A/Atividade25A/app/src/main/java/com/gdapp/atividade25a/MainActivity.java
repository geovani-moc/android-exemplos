package com.gdapp.atividade25a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private  MyBroadCast receiver;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //receiver = new MyBroadCast();
        //intent = new Intent("android.provider.Telephony.SMS_RECEIVED");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //unregisterReceiver(receiver);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //registerReceiver(receiver, intent);
    }
}
