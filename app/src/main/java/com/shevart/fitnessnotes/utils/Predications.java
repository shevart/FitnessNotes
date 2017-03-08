package com.shevart.fitnessnotes.utils;

public class Predications {
    public static <T> T checkNonNull(T object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return object;
    }

    public static String checkNonNullOrEmpty(String str) {
        if (str == null) throw new NullPointerException();
        if (str.isEmpty()) throw new RuntimeException("The string is empty!");
        return str;
    }

}
