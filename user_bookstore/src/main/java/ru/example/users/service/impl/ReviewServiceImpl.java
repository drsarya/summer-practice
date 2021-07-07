package ru.example.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.users.db.entity.Review;
import ru.example.users.db.repository.ReviewRepository;
import ru.example.users.db.repository.UserRepository;
import ru.example.users.dto.ReviewDto;
import ru.example.users.mapper.ReviewMapper;
import ru.example.users.service.ReviewService;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;
    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;

    @Autowired
    public ReviewServiceImpl(ReviewMapper reviewMapper, ReviewRepository reviewRepository, UserRepository userRepository) {
        this.reviewMapper = reviewMapper;
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
    }

    @Override
    public ReviewDto addReview(ReviewDto reviewDto) {
        if (!userRepository.existsById(reviewDto.getUserId()))
            throw new IllegalArgumentException("Пользователь не найден");
        Review review = reviewMapper.reviewDtoToReview(reviewDto);
        return reviewMapper.reviewToReviewDto(reviewRepository.save(review));
    }

    @Override
    public List<ReviewDto> getReviewsByBookId(Integer bookId) {
        List<Review> reviews = reviewRepository.findAllByBookId(bookId);
        return reviewMapper.toListReviewDto(reviews);
    }
}
