package ru.example.bookdiscount.controller;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.example.bookdiscount.handler.ErrorModel;
import ru.example.bookdiscount.handler.ValidationErrorTerms;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    ResponseEntity<List<ErrorModel>> handleConstraintViolationException(ConstraintViolationException e) {
        final Set<ConstraintViolation<?>> errors = e.getConstraintViolations();
        final List<ErrorModel> errorModels = errors.stream()
                .map(err -> new ErrorModel(err.getMessage(), ValidationErrorTerms.getMessageByCode(err.getMessage())))
                .collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorModels);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    ResponseEntity<List<ErrorModel>> handleConstraintViolationException(DataIntegrityViolationException e) {
        List<ErrorModel> errorModels = Arrays.asList(new ErrorModel(ValidationErrorTerms.KEY_NOT_UNIQUE, e.getMessage()));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorModels);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    ResponseEntity<ErrorModel> handleConstraintViolationException(IllegalArgumentException e) {
        ErrorModel errorModels = new ErrorModel("Error", e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorModels);
    }
}
