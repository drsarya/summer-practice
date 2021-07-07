package ru.example.users.service;

import ru.example.users.db.entity.Review;
import ru.example.users.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    ReviewDto addReview(ReviewDto reviewDto);

    List<ReviewDto> getReviewsByBookId(Integer bookId);
}
