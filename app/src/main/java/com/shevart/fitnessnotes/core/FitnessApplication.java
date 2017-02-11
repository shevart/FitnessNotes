package com.shevart.fitnessnotes.core;


import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;


public class FitnessApplication extends Application implements App {
    public static App getApp(@NonNull Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
