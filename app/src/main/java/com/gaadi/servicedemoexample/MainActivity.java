package com.gaadi.servicedemoexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("ankur","MainActivity onCreate");
    }

    public void click(View view){
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("ankur","ServiceDemo onStartCommand : "+Thread.currentThread().getName().toString());
                startService(new Intent(getApplicationContext(),ServiceDemo.class));
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("ankur","ServiceDemo onStartCommand : "+Thread.currentThread().getName().toString());
                startService(new Intent(getApplicationContext(),ServiceDemo.class));
            }
        }).start();*/

        startService(new Intent(this,ServiceDemo.class));
        startService(new Intent(this,ServiceDemo.class));

        //startService(new Intent(this,IntentServiceDemo.class));
        //startService(new Intent(this,IntentServiceDemo.class));

        /*new Thread()
        {
            public void run() {
                System.out.println("blah");
            }
        }.start();*/
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i("ankur","MainActivity onDestroy");
    }
}
