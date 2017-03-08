package com.shevart.fitnessnotes.data.providers.db.sqlite.dao;


import android.support.annotation.NonNull;

@SuppressWarnings({"unused", "WeakerAccess"})
public class BaseDao {
    protected static final String COMMA = ",";
    protected static final String CREATE_TABLE = "CREATE TABLE ";

    protected static final class SqlTypes {
        protected static final String INTEGER_PRIMARY_KEY = " INTEGER PRIMARY KEY ";
        protected static final String INTEGER = " INTEGER ";
        protected static final String REAL = " REAL ";
        protected static final String TEXT = " TEXT ";
    }


    protected static final class CreateTableBuilder {
        private boolean isPrimaryKeyAlreadyDefined = false;
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

        public CreateTableBuilder addIntegerPrimaryKeyColumn(@NonNull String columnName) {
            if (isPrimaryKeyAlreadyDefined) throw new RuntimeException("Primary key cannot be more than one!");
            isPrimaryKeyAlreadyDefined = true;
            sqlStringBuilder.append(columnName);
            sqlStringBuilder.append(SqlTypes.INTEGER_PRIMARY_KEY);
            return this;
        }

        public CreateTableBuilder addIntegerColumn(@NonNull String columnName) {
            sqlStringBuilder.append(columnName);
            sqlStringBuilder.append(SqlTypes.INTEGER);
            return this;
        }

        public CreateTableBuilder addTextColumn(@NonNull String columnName) {
            sqlStringBuilder.append(columnName);
            sqlStringBuilder.append(SqlTypes.TEXT);
            return this;
        }

        public CreateTableBuilder addRealColumn(@NonNull String columnName) {
            sqlStringBuilder.append(columnName);
            sqlStringBuilder.append(SqlTypes.REAL);
            return this;
        }

        public String toSql() {
            sqlStringBuilder.append(")");
            return sqlStringBuilder.toString();
        }
    }
}
