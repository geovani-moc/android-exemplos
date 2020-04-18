package com.gdapp.atividade27;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MybroadCast03 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = getResultExtras(true);
        int numero3 = 103;
        bundle.putInt("numero3", numero3);
        Log.i("testebc", "BroadCast 3 inseriu: "+ numero3);
    }
}
