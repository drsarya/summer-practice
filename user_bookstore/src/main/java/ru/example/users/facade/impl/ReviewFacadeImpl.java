package ru.example.users.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.users.db.entity.Review;
import ru.example.users.dto.ReviewDto;
import ru.example.users.facade.ReviewFacade;
import ru.example.users.service.ReviewService;

import javax.validation.Valid;
import java.util.List;
@Service
public class ReviewFacadeImpl implements ReviewFacade {
    private final ReviewService reviewService;

    @Autowired
    public ReviewFacadeImpl(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @Override
    public ReviewDto addReview(@Valid ReviewDto reviewDto) {
        return reviewService.addReview(reviewDto);
    }

    @Override
    public List<ReviewDto> getReviewsByBookId(Integer bookId) {
        return reviewService.getReviewsByBookId(bookId);
    }
}
