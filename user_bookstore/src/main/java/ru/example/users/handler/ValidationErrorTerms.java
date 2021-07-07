package ru.example.users.handler;

import java.util.HashMap;
import java.util.Map;

public class ValidationErrorTerms {
    public static final String PLACE_ID_MUST_BE_SET = "PlaceId must be set";
    public static final String PLACE_NAME_MUST_BE_SET = "PlaceName must be set";
    public static final String CITY_ID_MUST_BE_SET = "CityId must be set";

    private static final Map<String, String> ERRORS = new HashMap<String, String>() {
        {
            put(PLACE_ID_MUST_BE_SET, "установите PlaceId");
            put(PLACE_NAME_MUST_BE_SET, "установите PlaceName");
            put(CITY_ID_MUST_BE_SET, "установите CityId");
        }

    };
    public static String getMessageByCode(String code) {
        return ERRORS.get(code);
    }
}
