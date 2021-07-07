package ru.example.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.users.db.entity.Review;
import ru.example.users.db.repository.ReviewRepository;
import ru.example.users.dto.ReviewDto;
import ru.example.users.mapper.ReviewMapper;
import ru.example.users.service.ReviewService;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewMapper reviewMapper, ReviewRepository reviewRepository) {
        this.reviewMapper = reviewMapper;
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review addReview(ReviewDto reviewDto) {
        return null;
    }

    @Override
    public List<ReviewDto> getReviewsByBookId(Integer bookId) {
        return null;
    }
}
