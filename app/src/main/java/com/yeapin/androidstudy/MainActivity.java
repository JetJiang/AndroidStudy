package com.yeapin.androidstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Jet
 * 2016-02-18
 */
public class MainActivity extends AppCompatActivity {

    public final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"执行onCreate方法");
        //mac修改
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"执行onStart方法");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"执行onResume方法");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"执行onRestart方法");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"执行onPause方法");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"执行onStop方法");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"执行onDestroy方法");
    }
}
