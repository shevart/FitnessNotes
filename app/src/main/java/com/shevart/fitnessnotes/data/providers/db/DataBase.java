package com.shevart.fitnessnotes.data.providers.db;

import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.models.User;

public interface DataBase {
    long add(@NonNull User user);
}
