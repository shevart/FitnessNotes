package com.shevart.fitnessnotes.data.providers.db.sqlite.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.annotation.NonNull;

import com.shevart.fitnessnotes.data.models.User;
import com.shevart.fitnessnotes.data.providers.db.sqlite.contract.UserContract;

public class UserDao {
    public static long add(@NonNull SQLiteDatabase sqLiteDatabase, @NonNull User user) {
        final SQLiteStatement sqLiteStatement = sqLiteDatabase.compileStatement(UserContract.INSERT_SCRIPT);
        bindSQLiteStatement(sqLiteStatement, user, false);
        return sqLiteStatement.executeInsert();
    }

    private static void bindSQLiteStatement(@NonNull SQLiteStatement sqLiteStatement,
                                            @NonNull User user,
                                            boolean withId) {
        int index = 1;
        if (withId) {
            sqLiteStatement.bindLong(index++, user.getId());
        }
        sqLiteStatement.bindString(index++, user.getName());
        sqLiteStatement.bindDouble(index++, user.getWeight());
        sqLiteStatement.bindLong(index++, user.getHeight());
    }
}
