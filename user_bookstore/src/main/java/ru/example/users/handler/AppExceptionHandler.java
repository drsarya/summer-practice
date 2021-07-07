package ru.example.users.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
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
}
