package com.example.android.week2secondappwb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainActivityFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("LifeCycle", "Fragment 1 - onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle", "Fragment 1 - onCreate()");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("LifeCycle", "Fragment 1 - onCreateView()");
        View view = inflater.inflate(R.layout.main_activity_fragment, container, false);
        Button firstFragmentButton = view.findViewById(R.id.firstFragmentButton);
        firstFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), SecondActivity.class));
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("LifeCycle", "Fragment 1 - onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LifeCycle", "Fragment 1 - onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LifeCycle", "Fragment 1 - onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LifeCycle", "Fragment 1 - onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("LifeCycle", "Fragment 1 - onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "Fragment 1 - onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("LifeCycle", "Fragment 1 - onDetach()");
    }
}
