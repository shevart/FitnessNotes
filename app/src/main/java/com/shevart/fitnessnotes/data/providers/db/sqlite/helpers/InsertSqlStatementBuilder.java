package com.shevart.fitnessnotes.data.providers.db.sqlite.helpers;

import android.support.annotation.NonNull;

import static com.shevart.fitnessnotes.utils.Predications.checkNonNullOrEmpty;

@SuppressWarnings({"WeakerAccess", "unused"})
public class InsertSqlStatementBuilder extends BaseSqlStatementBuilder {
    private final static String INSERT_INTO = "INSERT_INTO ";

    private InsertSqlStatementBuilder(@NonNull String tableName) {
        checkNonNullOrEmpty(tableName);
        sqlStringBuilder = new StringBuilder();
        sqlStringBuilder.append(INSERT_INTO);
        sqlStringBuilder.append(tableName);
        sqlStringBuilder.append(OPEN_BRACKET);
    }

    public static InsertSqlStatementBuilder createInsertSqlStatement(@NonNull String tableName) {
        return new InsertSqlStatementBuilder(tableName);
    }

    public InsertSqlStatementBuilder addColumn(@NonNull String columnName) {
        addColumnToStatement(columnName);
        return this;
    }
}
