package ru.example.bookstore.handler;

import java.util.HashMap;
import java.util.Map;

public class ValidationErrorTerms {
    public static final String KEY_NOT_UNIQUE = "error of unique";
    public static final String NAME_MUST_BE_SET = "name must be set";
    public static final String BOOK_ID_MUST_BE_SET = "book id must be set";
    public static final String AUTHOR_MUST_BE_SET = "author must be set";
    public static final String TITLE_MUST_BE_SET = "title must be set";
    public static final String PRICE_MUST_BE_SET = "price must be set";
    public static final String BOOK_NOT_FOUND = "книга не найдена";
    public static final String GROUP_NOT_FOUND = "группа не найдена";

    private static final Map<String, String> ERRORS = new HashMap<String, String>() {
        {
            put(KEY_NOT_UNIQUE, "Повторяющийся ник");
            put(NAME_MUST_BE_SET, "Установите id группы");
            put(BOOK_ID_MUST_BE_SET, "Установите id книги");
            put(AUTHOR_MUST_BE_SET, "Установите автора книги");
            put(TITLE_MUST_BE_SET, "Установите название книги");
            put(PRICE_MUST_BE_SET, "Установите стоимость книги");
        }

    };
    public static String getMessageByCode(String code) {
        return ERRORS.get(code);
    }
}
