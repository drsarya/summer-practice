package ru.example.users.mapper;

import org.mapstruct.Mapper;
import ru.example.users.db.entity.Review;
import ru.example.users.dto.ReviewDto;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    ReviewDto reviewToReviewDto(Review review);

    Review reviewDtoToReview(ReviewDto reviewDto);
}
