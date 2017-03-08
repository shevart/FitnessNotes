package com.shevart.fitnessnotes.data.providers.db.sqlite.dao;


import android.support.annotation.NonNull;

@SuppressWarnings({"unused", "WeakerAccess"})
public class BaseDao {
    protected static final String COMMA = ",";
    protected static final String CREATE_TABLE = "CREATE TABLE ";

    protected static final class CreateTableBuilder {
        private StringBuilder sqlStringBuilder;

        private CreateTableBuilder(@NonNull final String tableName) {
            sqlStringBuilder = new StringBuilder();
            sqlStringBuilder.append(CREATE_TABLE);
            sqlStringBuilder.append(tableName);
            sqlStringBuilder.append("(");
        }

        public static CreateTableBuilder createTable(@NonNull String tableName) {
            return new CreateTableBuilder(tableName);
        }

        public String getSql() {
            sqlStringBuilder.append(")");
            return sqlStringBuilder.toString();
        }
    }
}
