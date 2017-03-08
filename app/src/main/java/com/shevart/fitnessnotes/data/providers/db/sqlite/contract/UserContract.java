package com.shevart.fitnessnotes.data.providers.db.sqlite.contract;

import com.shevart.fitnessnotes.data.providers.db.sqlite.helpers.CreateTableBuilder;
import com.shevart.fitnessnotes.data.providers.db.sqlite.dao.BaseDao;
import com.shevart.fitnessnotes.data.providers.db.sqlite.helpers.InsertSqlStatementBuilder;

@SuppressWarnings({"WeakerAccess", "unused"})
public class UserContract extends BaseDao {
    public static final String TABLE_NAME = "Profile";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String WEIGHT = "weight";
    public static final String HEIGHT = "height";

    public static final String CREATE_SCRIPT = CreateTableBuilder.createTable(TABLE_NAME)
        .addIntegerPrimaryKeyColumn(ID)
        .addTextColumn(NAME)
        .addRealColumn(WEIGHT)
        .addIntegerColumn(HEIGHT)
        .toSql();

    public static final String INSERT_SCRIPT = InsertSqlStatementBuilder.createInsertSqlStatement(TABLE_NAME)
            .addColumn(NAME)
            .addColumn(WEIGHT)
            .addColumn(HEIGHT)
            .createSQSqLiteStatement();

    public static final String DROP_SCRIPT = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
