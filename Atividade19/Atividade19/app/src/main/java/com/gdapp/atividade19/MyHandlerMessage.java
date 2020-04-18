package com.gdapp.atividade19;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;

public class MyHandlerMessage extends Handler {

    public static final int ATUALIZAR = 100;

    private TextView t;
    private Button b;

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);

        if (msg.what == ATUALIZAR) {
            t.setText(R.string.concluido);
            b.setEnabled(true);
        }
    }

    public MyHandlerMessage(TextView t, Button b) {
        super();
        this.t = t;
        this.b = b;
    }
}