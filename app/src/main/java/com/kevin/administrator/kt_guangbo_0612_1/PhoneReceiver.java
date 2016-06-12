package com.kevin.administrator.kt_guangbo_0612_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/6/12.
 */
public class PhoneReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(TelephonyManager.ACTION_PHONE_STATE_CHANGED)) {
            String phoneNumber = intent.getExtras().getString("incoming_number");
            TelephonyManager manager = (TelephonyManager) context
                    .getSystemService(Context.TELEPHONY_SERVICE);

            int state = manager.getCallState();
            switch (state) {
                case TelephonyManager.CALL_STATE_RINGING:
                    Toast.makeText(context, "来电话了" + phoneNumber, Toast.LENGTH_SHORT).show();
                    break;
                case TelephonyManager.CALL_STATE_IDLE:
                    Toast.makeText(context, "挂断了" + phoneNumber, Toast.LENGTH_SHORT).show();
                    break;
                case TelephonyManager.CALL_STATE_OFFHOOK:
                    Toast.makeText(context, "接通了" + phoneNumber, Toast.LENGTH_SHORT).show();
                    break;
            }

            if (action.equals("android.intent.action.NEW_OUTGOING_CALL")) {
                String outCallNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);
                Toast.makeText(context, "播出的电话号码" + outCallNumber, Toast.LENGTH_SHORT).show();

            }
        }
    }
}
