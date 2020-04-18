package com.gdapp.atividade27;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MyBroadCast02 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = getResultExtras(true);
        if (bundle.equals(null))
        {
            Log.i("broadcast", "BroadCast 02: VAZIO");
        }
        int numero2 = 102;
        bundle.putInt("numero2", numero2);

        Log.i("testebc", "BroadCast 02: numero 2 foi adicionado: "+ numero2);
    }
}
