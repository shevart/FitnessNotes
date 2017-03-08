package com.shevart.fitnessnotes.data.providers.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.providers.db.sqlite.OpenHelper;

public class DatabaseManager implements DataBase {
    private final SQLiteDatabase database;

    public DatabaseManager(@NonNull Context context) {
        final SQLiteOpenHelper sqLiteOpenHelper = new OpenHelper(context);
        database = sqLiteOpenHelper.getWritableDatabase();
    }
}
