package com.shevart.fitnessnotes.data.source;

import com.shevart.fitnessnotes.data.providers.db.DataBase;
import com.shevart.fitnessnotes.data.providers.sharedprefs.SharedPrefs;

public interface DataProvidersBridge {
    DataBase getDatabase();

    SharedPrefs getSharedPrefs();
}
