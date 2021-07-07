package ru.example.users.handler;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Getter;
@JsonDeserialize
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
