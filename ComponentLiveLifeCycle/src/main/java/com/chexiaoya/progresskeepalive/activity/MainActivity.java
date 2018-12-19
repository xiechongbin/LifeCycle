package com.chexiaoya.progresskeepalive.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.chexiaoya.progresskeepalive.R;
import com.chexiaoya.progresskeepalive.fragment.FragmentA;
import com.chexiaoya.progresskeepalive.fragment.FragmentB;
import com.chexiaoya.progresskeepalive.service.MyService;


/**
 * 生命周期测试
 */
public class MainActivity extends AppCompatActivity {

    private FragmentA fragmentA;
    private FragmentB fragmentB;

    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("liveTest", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("liveTest", "onStart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d("liveTest", "onPostCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("liveTest", "onResume");
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("liveTest", "onPostResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("liveTest", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("liveTest", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("liveTest", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("liveTest", "onRestart");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("liveTest", "onSaveInstanceState");
    }


    public void onClickAdd(View view) {
        //测试activity 跳转生命周期的变化
        //Intent intent = new Intent(this, MainActivityB.class);
        //startActivity(intent);

        //测试对话框弹出生命周期的变化
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setMessage("对话框测试").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                dialog.dismiss();
//            }
//        }).create().show();

        //测试fragment的生命周期
        fragmentA = FragmentA.newInstance("test", "test");
        fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frag_container, fragmentA, FragmentA.class.getSimpleName());
        fragmentTransaction.commitAllowingStateLoss();

        fragmentB = FragmentB.newInstance("test", "test");
        fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frag_container, fragmentB, FragmentA.class.getSimpleName());
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void onClickReplace(View view) {
        fragmentB = FragmentB.newInstance("test", "test");
        fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frag_container, fragmentB, FragmentB.class.getSimpleName());
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void onClickHideShow(View view) {
        if (fragmentB != null && fragmentB.isVisible()) {
            fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
            fragmentTransaction.hide(fragmentB);
        } else if (fragmentB != null && !fragmentB.isVisible()) {
            fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
            fragmentTransaction.show(fragmentB);
        }
        fragmentTransaction.commit();
    }

    public void onClickRemove(View view) {
        if (fragmentA != null) {
            fragmentTransaction = this.getSupportFragmentManager().beginTransaction();
            fragmentTransaction.remove(fragmentA);
            fragmentTransaction.commitAllowingStateLoss();
        }
    }

    public void onStartService(View view) {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }


    public void onBindService(View view) {
        Intent intent = new Intent(this, MyService.class);
        bindService(intent, connection, BIND_AUTO_CREATE);
    }

    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    };


}
