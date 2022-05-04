package com.example.android.week2secondappwb;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondActivityFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("LifeCycle", "Fragment 2 - onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle", "Fragment 2 - onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("LifeCycle", "Fragment 2 - onCreateView()");
        View view = inflater.inflate(R.layout.second_activity_fragment, container, false);
        Button secondFragmentButton = view.findViewById(R.id.secondFragmentButton);
        secondFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyAlertDialog().show(getChildFragmentManager(), MyAlertDialog.TAG);
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("LifeCycle", "Fragment 2 - onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LifeCycle", "Fragment 2 - onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LifeCycle", "Fragment 2 - onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LifeCycle", "Fragment 2 - onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("LifeCycle", "Fragment 2 - onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "Fragment 2 - onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("LifeCycle", "Fragment 2 - onDetach()");
    }
}
