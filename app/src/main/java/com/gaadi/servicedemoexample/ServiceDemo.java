package com.gaadi.servicedemoexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by ankurkumarjha on 19/10/16.
 */

public class ServiceDemo extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("ankur","ServiceDemo onBind");
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("ankur","ServiceDemo onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("ankur","ServiceDemo onStartCommand : "+Thread.currentThread().getName().toString());
                for(int i=0;i<10;i++){
                    Log.i("ankur","Threadname : "+Thread.currentThread().getName().toString()+" , value : "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();*/

        Log.i("ankur","ServiceDemo onStartCommand : "+Thread.currentThread().getName().toString());
        for(int i=0;i<10;i++){
            Log.i("ankur","Threadname : "+Thread.currentThread().getName().toString()+" , value : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i("ankur","ServiceDemo onDestroy");
        super.onDestroy();
    }
}
