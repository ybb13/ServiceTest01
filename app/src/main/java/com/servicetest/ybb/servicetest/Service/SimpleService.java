package com.servicetest.ybb.servicetest.Service;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2017/8/17.
 */

public class SimpleService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Log.d("yyyyyyyyyyyyyy","onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("yyyyyyyyyyyyyy","onStartCommand");
        return START_STICKY;
    }
}
