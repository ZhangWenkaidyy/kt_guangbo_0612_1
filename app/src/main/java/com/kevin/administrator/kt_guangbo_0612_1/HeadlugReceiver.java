package com.kevin.administrator.kt_guangbo_0612_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;

/**
 * Created by Administrator on 2016/6/12.
 */
public class HeadlugReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if(action.equals(AudioManager.ACTION_HEADSET_PLUG)){
            if(intent.hasExtra("state")){
                if(intent.getIntExtra("state",-1)==0){

                }

            }
        }
    }
}
