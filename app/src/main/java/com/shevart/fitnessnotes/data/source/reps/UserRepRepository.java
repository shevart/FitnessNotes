package com.shevart.fitnessnotes.data.source.reps;

import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.models.User;
import com.shevart.fitnessnotes.data.source.DataProvidersBridge;
import com.shevart.fitnessnotes.data.source.DataSource;


public class UserRepRepository extends BaseDataRepository implements DataSource.UserRep {
    public UserRepRepository(@NonNull DataProvidersBridge dataProvidersBridge) {
        super(dataProvidersBridge);
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void saveUser(@NonNull User user) {

    }
}
