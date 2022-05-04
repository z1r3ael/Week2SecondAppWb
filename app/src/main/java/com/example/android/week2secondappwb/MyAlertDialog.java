package com.example.android.week2secondappwb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyAlertDialog extends DialogFragment {

    public static String TAG = "MyAlertDialog";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("LifeCycle", "AlertDialog - onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("LifeCycle", "AlertDialog - onCreate()");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Log.d("LifeCycle", "AlertDialog - onCreateDialog()");
        return new AlertDialog.Builder(requireContext())
                .setMessage("Перед вами AlertDialog. Хотите закрыть его?")
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("LifeCycle", "AlertDialog - onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LifeCycle", "AlertDialog - onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LifeCycle", "AlertDialog - onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LifeCycle", "AlertDialog - onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("LifeCycle", "AlertDialog - onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "AlertDialog - onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("LifeCycle", "AlertDialog - onDetach()");
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d("LifeCycle", "AlertDialog - onDismiss()");
    }

    @Override
    public void onCancel(@NonNull DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d("LifeCycle", "AlertDialog - onCancel()");
    }
}
