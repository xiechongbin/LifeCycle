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
public class FragmentA extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public static FragmentA newInstance(String param1, String param2) {
        FragmentA fragment = new FragmentA();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("liveTest", "FragmentA>>onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Log.d("liveTest", "FragmentA>>onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("liveTest", "FragmentA>>onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("liveTest", "FragmentA>>onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("liveTest", "FragmentA>>onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("liveTest", "FragmentA>>onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("liveTest", "FragmentA>>onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("liveTest", "FragmentA>>onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("liveTest", "FragmentA>>onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("liveTest", "FragmentA>>onDestroy");
    }


    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("liveTest", "FragmentA>>onDetach");
    }
}
