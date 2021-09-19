package com.example.ahmedfarouk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
final static String tag="lifecycle" ;
String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag ,msg="onCreate");


    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(tag ,msg="onStart");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(tag ,msg="onResume");

    }
    @Override
    protected void onPause()
    {
    super.onPause();
        Log.i(tag ,msg="onPause");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(tag ,msg="onStop");

    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(tag ,msg="onRestart");

    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(tag ,msg="onDestroy");

    }


}