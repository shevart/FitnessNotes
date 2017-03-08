package com.shevart.fitnessnotes.data.providers.db.sqlite.helpers;

@SuppressWarnings("WeakerAccess")
class BaseBuilder {
    static final String COMMA = ",";
    protected StringBuilder sqlStringBuilder;

    void removeLastComma() {
        sqlStringBuilder.replace(
                sqlStringBuilder.lastIndexOf(COMMA),
                sqlStringBuilder.lastIndexOf(COMMA) + 1
                , "");
    }
}
