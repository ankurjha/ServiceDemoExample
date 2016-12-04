package com.gaadi.servicedemoexample;

import android.app.Application;
import android.util.Log;
/**
 * Created by ankurkumarjha on 3/12/16.
 */
public class MyAppilcation extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Log.i("ankur","oncreate called bhai");
    }
}
