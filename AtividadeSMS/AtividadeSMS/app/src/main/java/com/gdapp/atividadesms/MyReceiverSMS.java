package com.gdapp.atividadesms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;


public class MyReceiverSMS extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundleSMS = intent.getExtras();
        if(bundleSMS != null)
        {
            Object[] pdus = (Object[]) bundleSMS.get("pdus");// error
            if(pdus.length == 0)
            {
                return;
            }
            SmsMessage[] menssagens = new SmsMessage[pdus.length];
            StringBuilder stringBuilderSMS = new StringBuilder();
            for (int i=0; i<pdus.length; i++)
            {
                menssagens[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
                stringBuilderSMS.append(menssagens[i].getMessageBody());
            }

            String message = stringBuilderSMS.toString();
            if (message.equals("4T1VAr_30M3a"))
            {
                Intent intentContagemRegressiva = new Intent(context.getApplicationContext(), ContagemRegressiva.class);
                intentContagemRegressiva.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intentContagemRegressiva);
            }

        }
    }
}
