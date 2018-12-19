package com.chexiaoya.progresskeepalive.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d("liveTest", "MyService>>onBind");
        return new MyBinder();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("liveTest", "MyService>>onCreate");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.d("liveTest", "MyService>>onStart");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("liveTest", "MyService>>onDestroy");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("liveTest", "MyService>>onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    private class MyBinder extends Binder {
        public MyService getService() {
            return MyService.this;
        }
    }

}
