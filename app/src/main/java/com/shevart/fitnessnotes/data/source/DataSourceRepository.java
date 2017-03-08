package com.shevart.fitnessnotes.data.source;

import com.shevart.fitnessnotes.data.source.reps.UserRepRepository;

public class DataSourceRepository implements DataSource {

    private UserRep userRepRepository;

    public DataSourceRepository() {
        userRepRepository = new UserRepRepository();
    }

    @Override
    public UserRep User() {
        return userRepRepository;
    }
}
