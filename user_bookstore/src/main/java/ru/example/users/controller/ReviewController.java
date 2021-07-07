package ru.example.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.example.users.dto.ReviewDto;
import ru.example.users.facade.ReviewFacade;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(
        value = "/review",
        produces = "application/json"
)
public class ReviewController {
    private final ReviewFacade reviewFacade;

    @Autowired
    public ReviewController(ReviewFacade reviewFacade) {
        this.reviewFacade = reviewFacade;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void addReview( @RequestBody ReviewDto reviewDto) {
        reviewFacade.addReview(reviewDto);
    }

    @GetMapping(value = "/{bookId}")
    List<ReviewDto> getReviewsByBookId(@PathVariable Integer bookId) {
        System.out.println(bookId);
        return null;
    }
}