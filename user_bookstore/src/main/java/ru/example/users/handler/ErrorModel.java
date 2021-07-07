package ru.example.users.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorModel {
    private final String code;
    private final String message;
}
