package com.kevin.administrator.kt_guangbo_0612_1;

import android.content.IntentFilter;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private  HeadlugReceiver headlugReceiver;
    /**
     * BrodcastReceiver广播接收器
     * 它是一个在应用程序之间进行消息传递的应用程序组件
     *
     * 广播的原理，采用订阅-发布模式
     *
     * 默认情况下，广播采取的是异步处理机制
     *
     * 默认情况下广播的发送方将广播标记后发出
     *
     * 这时发送方不需要等待回复信息可以继续向下执行。
     * 默认情况下所有的组件都具有接收和处理广播的资格，哪个
     * 组件需要接收
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registerHeadPluReceiver(){
        headlugReceiver=new HeadlugReceiver();
        IntentFilter intentFilter=new IntentFilter();
        intentFilter.addAction(AudioManager.ACTION_HEADSET_PLUG);
        registerReceiver(headlugReceiver,intentFilter);
        unregisterReceiver(headlugReceiver);
    }
}


