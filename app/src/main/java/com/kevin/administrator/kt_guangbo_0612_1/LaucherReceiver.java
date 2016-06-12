package com.kevin.administrator.kt_guangbo_0612_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/6/12.
 */
public class LaucherReceiver extends BroadcastReceiver {

    /**
     *
     * @param context
     * @param intent 意图对象 封装广播信息
     */
    @Override
    public void onReceive(Context context, Intent intent) {
String action=intent.getAction();
        if(action.equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context, "手机开机了", Toast.LENGTH_SHORT).show();
        }
    }
}
