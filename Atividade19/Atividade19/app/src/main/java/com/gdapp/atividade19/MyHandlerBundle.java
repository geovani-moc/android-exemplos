package com.gdapp.atividade19;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MyHandlerBundle extends Handler {

    public static final int ATUALIZAR = 100;

    private TextView t;
    private Button b;

    public MyHandlerBundle(TextView t, Button b) {
        super();
        this.t = t;
        this.b = b;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);

        if (msg.what == ATUALIZAR) {
            Bundle data = msg.getData();
            int i = data.getInt("test");

            Log.d("MyHandler", "getData(): " + i);

            t.setText(R.string.concluido);
            b.setEnabled(true);
        }
    }
}
