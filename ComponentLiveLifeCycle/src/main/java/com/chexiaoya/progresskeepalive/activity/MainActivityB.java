package com.chexiaoya.progresskeepalive.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.chexiaoya.progresskeepalive.R;

public class MainActivityB extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("liveTest", "onCreateB");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("liveTest", "onStartB");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("liveTest", "onPostCreateB");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("liveTest", "onResumeB");
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("liveTest", "onPostResumeB");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("liveTest", "onPauseB");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("liveTest", "onStopB");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("liveTest", "onDestroyB");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("liveTest", "onRestartB");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("liveTest", "onSaveInstanceStateB");
    }
}
