package com.chexiaoya.progresskeepalive.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chexiaoya.progresskeepalive.R;

/**
 * fragment 生命周期测试
 */
public class FragmentB extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public static FragmentB newInstance(String param1, String param2) {
        FragmentB fragment = new FragmentB();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("liveTest", "FragmentB>>onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Log.d("liveTest", "FragmentB>>onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("liveTest", "FragmentB>>onCreateView");
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("liveTest", "FragmentB>>onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("liveTest", "FragmentB>>onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("liveTest", "FragmentB>>onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("liveTest", "FragmentB>>onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("liveTest", "FragmentB>>onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("liveTest", "FragmentB>>onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("liveTest", "FragmentB>>onDestroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("liveTest", "FragmentB>>onDetach");
    }
}
