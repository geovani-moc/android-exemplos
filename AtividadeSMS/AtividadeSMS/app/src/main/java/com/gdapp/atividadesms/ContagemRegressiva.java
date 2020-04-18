package com.gdapp.atividadesms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;

public class ContagemRegressiva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //Bitmap bm = BitmapFactory.decodeResource(getResources(), R.drawable.luz);

        Intent intent = new Intent(getApplicationContext(), DesarmarBomba.class);

        PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0,intent, 0);

        Notification.Builder myBuider = new Notification.Builder(this)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle("Contagem regressiva iniciada ...")
                //.setContentText("Texto da not")
                .setContentIntent(pendingIntent);
                //.setLargeIcon(bm);

        Notification notification = myBuider.build();
        notificationManager.notify(99, notification);
        //contador();
    }
    // fazer uma Thread, apenas teste
    /*public void contador() {
        for (int i=30; i <= 0; i--)
        {
            try{
            //Thread.sleep(2000);
            Log.i("atividadeSMS", "contador: " + i);
            }catch(Exception e)
            {
                Log.e("contador", "falha no contador", e);
            }
        }

        NotificationManager notificationManagerDesarmar = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManagerDesarmar.cancel(99);

        //startActivity(new Intent(getApplicationContext(), TelaExplosao.class));

    }*/
}
