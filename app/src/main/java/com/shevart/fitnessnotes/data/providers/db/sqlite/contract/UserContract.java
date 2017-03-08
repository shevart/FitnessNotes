package com.shevart.fitnessnotes.data.providers.db.sqlite.contract;

import com.shevart.fitnessnotes.data.providers.db.sqlite.dao.BaseDao;

@SuppressWarnings({"WeakerAccess", "unused"})
public class UserContract extends BaseDao {
    public static final String TABLE_NAME = "Profile";
    public static final String ID = "id";
    public static final String NAME = "name";
    public static final String WEIGHT = "weight";
    public static final String HEIGHT = "height";

    public static final String CREATE_SCRIPT = "CREATE TABLE " + TABLE_NAME + "(" +
            ID + " INTEGER PRIMARY KEY, " +
            NAME + " TEXT, " +
            WEIGHT + " REAL," +
            HEIGHT + " INTEGER " +
            ");";

    public static final String INSERT_SCRIPT = "INSERT INTO " + TABLE_NAME + "(" +
            ")";

    public static final String DROP_SCRIPT = "DROP TABLE IF EXISTS " + TABLE_NAME;
}
