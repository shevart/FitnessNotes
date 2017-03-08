package com.shevart.fitnessnotes.data.source;

import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.models.User;

public interface DataSource {

    UserRep User();

    interface UserRep {
        User getUser();

        void saveUser(@NonNull User user);
    }
}
