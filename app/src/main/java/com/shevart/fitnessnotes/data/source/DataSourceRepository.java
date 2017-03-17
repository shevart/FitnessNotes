package com.shevart.fitnessnotes.data.source;

import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.providers.db.DataBase;
import com.shevart.fitnessnotes.data.providers.sharedprefs.SharedPrefs;
import com.shevart.fitnessnotes.data.source.reps.UserRepRepository;

import static com.shevart.fitnessnotes.utils.Predicates.checkNonNull;

public class DataSourceRepository implements DataSource, DataProvidersBridge {
    private DataBase dataBase;
    private SharedPrefs sharedPrefs;

    private UserRep userRepRepository;

    public DataSourceRepository(@NonNull DataBase dataBase, @NonNull SharedPrefs sharedPrefs) {
        this.dataBase = checkNonNull(dataBase);
        this.sharedPrefs = checkNonNull(sharedPrefs);
        userRepRepository = new UserRepRepository(this);
    }

    @Override
    public UserRep User() {
        return userRepRepository;
    }

    @Override
    public DataBase getDatabase() {
        return dataBase;
    }

    @Override
    public SharedPrefs getSharedPrefs() {
        return sharedPrefs;
    }
}
