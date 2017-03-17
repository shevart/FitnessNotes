package com.shevart.fitnessnotes.data.providers.db.sqlite.helpers;

import android.support.annotation.NonNull;

import static com.shevart.fitnessnotes.utils.Predicates.checkNonNullOrEmpty;

@SuppressWarnings({"WeakerAccess", "unused"})
public final class CreateTableBuilder extends BaseBuilder {
    private static final String CREATE_TABLE = "CREATE TABLE ";
    private boolean isPrimaryKeyAlreadyDefined = false;


    private CreateTableBuilder(@NonNull final String tableName) {
        checkNonNullOrEmpty(tableName);
        sqlStringBuilder = new StringBuilder();
        sqlStringBuilder.append(CREATE_TABLE);
        sqlStringBuilder.append(tableName);
        sqlStringBuilder.append(OPEN_BRACKET);
    }

    public static CreateTableBuilder createTable(@NonNull String tableName) {
        return new CreateTableBuilder(tableName);
    }

    public CreateTableBuilder addIntegerPrimaryKeyColumn(@NonNull String columnName) {
        if (isPrimaryKeyAlreadyDefined)
            throw new RuntimeException("Primary key cannot be more than one!");
        isPrimaryKeyAlreadyDefined = true;
        sqlStringBuilder.append(columnName);
        sqlStringBuilder.append(SqlTypes.INTEGER_PRIMARY_KEY);
        sqlStringBuilder.append(COMMA);
        return this;
    }

    public CreateTableBuilder addIntegerColumn(@NonNull String columnName) {
        sqlStringBuilder.append(columnName);
        sqlStringBuilder.append(SqlTypes.INTEGER);
        sqlStringBuilder.append(COMMA);
        return this;
    }

    public CreateTableBuilder addTextColumn(@NonNull String columnName) {
        sqlStringBuilder.append(columnName);
        sqlStringBuilder.append(SqlTypes.TEXT);
        sqlStringBuilder.append(COMMA);
        return this;
    }

    public CreateTableBuilder addRealColumn(@NonNull String columnName) {
        sqlStringBuilder.append(columnName);
        sqlStringBuilder.append(SqlTypes.REAL);
        sqlStringBuilder.append(COMMA);
        return this;
    }

    public String toSql() {
        removeLastComma();
        sqlStringBuilder.append(CLOSE_BRACKET);
        return sqlStringBuilder.toString();
    }
}
