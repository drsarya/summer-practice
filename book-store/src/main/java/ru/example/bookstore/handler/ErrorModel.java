package ru.example.bookstore.handler;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ErrorModel {

    @JsonProperty
    private final String code;

    @JsonProperty
    private final String message;

    public ErrorModel(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
