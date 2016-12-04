package com.gaadi.servicedemoexample;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ankurkumarjha on 4/12/16.
 */

public class IntentServiceDemo extends IntentService
{
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name
     *         Used to name the worker thread, important only for debugging.
     */
    public IntentServiceDemo()
    {
        super("ankur Intent service");
    }

    @Override
    protected void onHandleIntent(Intent intent)
    {
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("ankur", "ServiceDemo onStartCommand : "+Thread.currentThread().getName().toString());
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

        for(int i=0;i<10;i++){
            Log.i("ankur","Threadname : "+Thread.currentThread().getName().toString()+" , value : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
