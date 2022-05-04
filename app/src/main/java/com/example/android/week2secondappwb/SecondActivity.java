package com.example.android.week2secondappwb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("LifeCycle", "Activity 2 - onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "Activity 2 - onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "Activity 2 - onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "Activity 2 - onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "Activity 2 - onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "Activity 2 - onDestroy()");
    }
}