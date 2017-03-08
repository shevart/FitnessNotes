package com.shevart.fitnessnotes.utils;

public class Predications {
    public static <T> T checkNonNull(T object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return object;
    }

}
