package ru.example.users.handler;

import java.util.HashMap;
import java.util.Map;

public class ValidationErrorTerms {
    public static final String KEY_NOT_UNIQUE = "error of unique";
    public static final String NAME_MUST_BE_SET = "name must be set";
    public static final String BOOK_ID_MUST_BE_SET = "book id must be set";
    public static final String USER_ID_MUST_BE_SET = "user id must be set";

    private static final Map<String, String> ERRORS = new HashMap<String, String>() {
        {
            put(KEY_NOT_UNIQUE, "Повторяющийся ник");
            put(NAME_MUST_BE_SET, "Установите имя пользователя");
            put(BOOK_ID_MUST_BE_SET, "Установите id книги");
            put(USER_ID_MUST_BE_SET, "Установите id  пользователя");
        }

    };
    public static String getMessageByCode(String code) {
        return ERRORS.get(code);
    }
}
