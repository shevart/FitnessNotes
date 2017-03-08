package com.shevart.fitnessnotes.data.source.reps;

import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.models.User;
import com.shevart.fitnessnotes.data.source.DataSource;


public class UserRepRepository implements DataSource.UserRep {

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void saveUser(@NonNull User user) {

    }
}
