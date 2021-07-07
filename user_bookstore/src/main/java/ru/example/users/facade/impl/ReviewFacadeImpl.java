package ru.example.users.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.example.users.db.entity.Review;
import ru.example.users.dto.ReviewDto;
import ru.example.users.facade.ReviewFacade;
import ru.example.users.service.ReviewService;

import java.util.List;

public class ReviewFacadeImpl implements ReviewFacade {
    private final ReviewService reviewService;

    @Autowired
    public ReviewFacadeImpl(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @Override
    public Review addReview(ReviewDto reviewDto) {
        return reviewService.addReview(reviewDto);
    }

    @Override
    public List<ReviewDto> getReviewsByBookId(Integer bookId) {
        return reviewService.getReviewsByBookId(bookId);
    }
}
