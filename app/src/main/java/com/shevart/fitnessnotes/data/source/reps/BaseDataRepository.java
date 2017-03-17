package com.shevart.fitnessnotes.data.source.reps;

import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.providers.db.DataBase;
import com.shevart.fitnessnotes.data.providers.sharedprefs.SharedPrefs;
import com.shevart.fitnessnotes.data.source.DataProvidersBridge;

import static com.shevart.fitnessnotes.utils.Predicates.checkNonNull;

public abstract class BaseDataRepository implements DataProvidersBridge {
    private DataProvidersBridge mainDataProvidersBridge;

    public BaseDataRepository(@NonNull DataProvidersBridge dataProvidersBridge) {
        this.mainDataProvidersBridge = checkNonNull(dataProvidersBridge);
    }

    @Override
    public DataBase getDatabase() {
        return mainDataProvidersBridge.getDatabase();
    }

    @Override
    public SharedPrefs getSharedPrefs() {
        return mainDataProvidersBridge.getSharedPrefs();
    }
}
