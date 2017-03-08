package com.shevart.fitnessnotes.data.providers.db.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.shevart.fitnessnotes.data.providers.db.sqlite.contract.UserContract;


public class OpenHelper extends SQLiteOpenHelper {
    private static final String NAME = "FitnessNotes.sqlite";
    private static final int VERSION = 1;

    public OpenHelper(Context context) {
        super(context, NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(UserContract.CREATE_SCRIPT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
