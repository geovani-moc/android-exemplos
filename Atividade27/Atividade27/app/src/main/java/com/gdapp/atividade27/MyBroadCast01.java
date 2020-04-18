package com.gdapp.atividade27;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyBroadCast01 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = getResultExtras(true);
        int numero1 = 101;
        bundle.putInt("numero1", numero1);

        Log.i("testebc", "BroadCast 01: numero 1 adicionado: " + numero1);
    }
}
