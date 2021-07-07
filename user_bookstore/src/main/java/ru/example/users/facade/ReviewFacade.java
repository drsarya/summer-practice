package ru.example.users.facade;

import ru.example.users.db.entity.Review;
import ru.example.users.dto.ReviewDto;

import java.util.List;

public interface ReviewFacade {
    Review addReview(ReviewDto reviewDto);

    List<ReviewDto> getReviewsByBookId(Integer bookId);
}
