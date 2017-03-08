package com.shevart.fitnessnotes.data.providers.db.sqlite.helpers;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.support.annotation.NonNull;

@SuppressWarnings("WeakerAccess")
abstract class BaseSqlStatementBuilder extends BaseBuilder {
    final static String VALUES = " VALUES ";
    final static String SYMBOL_QUESTION_MARK = " ? ";

    protected int columnCount = 0;

    public SQLiteStatement createSQSqLiteStatement(@NonNull SQLiteDatabase database) {
        removeLastComma();
        sqlStringBuilder.append(CLOSE_BRACKET);
        sqlStringBuilder.append(VALUES);
        addQuestionMarksPart();
        return database.compileStatement(sqlStringBuilder.toString());
    }

    private void addQuestionMarksPart() {
        sqlStringBuilder.append(OPEN_BRACKET);
        for (int i = 0; i <columnCount; i++) {
            sqlStringBuilder.append(SYMBOL_QUESTION_MARK);
            sqlStringBuilder.append(COMMA);
        }
        sqlStringBuilder.append(CLOSE_BRACKET);
    }
}
