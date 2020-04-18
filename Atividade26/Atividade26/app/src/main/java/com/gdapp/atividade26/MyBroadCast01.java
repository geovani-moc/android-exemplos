package com.gdapp.atividade26;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyBroadCast01 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        int numero = bundle.getInt("numero");
        Log.i("broadcast", "numero: "+ numero);
    }
}

