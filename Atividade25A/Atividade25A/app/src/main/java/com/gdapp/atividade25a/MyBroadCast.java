package com.gdapp.atividade25a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.Date;

public class MyBroadCast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Date data = new Date();
        data.getTime();
        Log.i("Myreciver", "Menssagem Recebida em " + data.toString());
    }
}
