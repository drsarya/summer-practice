package ru.example.users.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.users.dto.ReviewDto;

import java.util.List;


@RestController
@RequestMapping(path = "/review", produces = "application/json")
public class ReviewController {
    @PostMapping
    ResponseEntity addReview(@RequestBody ReviewDto reviewDto) {
        return new ResponseEntity<>("json", HttpStatus.OK);
    }

    @GetMapping(value = "/{bookId}")
    List<ReviewDto> getReviewsByBookId(@PathVariable Integer bookId) {
        return null;
    }
}