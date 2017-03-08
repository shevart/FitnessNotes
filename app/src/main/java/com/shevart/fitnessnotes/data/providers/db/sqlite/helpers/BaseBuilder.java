package com.shevart.fitnessnotes.data.providers.db.sqlite.helpers;

@SuppressWarnings("WeakerAccess")
abstract class BaseBuilder {
    static final String COMMA = ",";
    static final String OPEN_BRACKET = " (";
    static final String CLOSE_BRACKET = ")";
    protected StringBuilder sqlStringBuilder;

    void removeLastComma() {
        sqlStringBuilder.replace(
                sqlStringBuilder.lastIndexOf(COMMA),
                sqlStringBuilder.lastIndexOf(COMMA) + 1
                , "");
    }
}
