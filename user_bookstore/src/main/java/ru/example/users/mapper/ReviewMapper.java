package ru.example.users.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.example.users.db.entity.Review;
import ru.example.users.dto.ReviewDto;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "textReview", source = "textReview")
    @Mapping(target = "bookId", source = "bookId")
    @Mapping(target = "userId", source = "userId")
    ReviewDto reviewToReviewDto(Review review);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "textReview", source = "textReview")
    @Mapping(target = "bookId", source = "bookId")
    @Mapping(target = "userId", source = "userId")
    Review reviewDtoToReview(ReviewDto reviewDto);

    default List<ReviewDto> toListReviewDto(List<Review> list) {
        return list
                .stream()
                .map(this::reviewToReviewDto)
                .collect(Collectors.toList());
    }
}
