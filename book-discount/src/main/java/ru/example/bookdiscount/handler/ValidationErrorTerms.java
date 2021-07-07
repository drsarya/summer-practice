package ru.example.bookdiscount.handler;

import java.util.HashMap;
import java.util.Map;

public class ValidationErrorTerms {
    public static final String KEY_NOT_UNIQUE = "error of unique";
    public static final String GROUP_NAME_MUST_BE_SET = "group must be set";
    public static final String PERCENT_MUST_BE_SET = "percent must be set";
    public static final String GROUP_NOT_FOUND = "Группа не найдена";
    private static final Map<String, String> ERRORS = new HashMap<String, String>() {
        {
            put(KEY_NOT_UNIQUE, "Повторяющийся ник");
            put(GROUP_NAME_MUST_BE_SET, "Установите название группы");
            put(PERCENT_MUST_BE_SET, "Установите величину процента");
        }
    };

    public static String getMessageByCode(String code) {
        return ERRORS.get(code);
    }
}
