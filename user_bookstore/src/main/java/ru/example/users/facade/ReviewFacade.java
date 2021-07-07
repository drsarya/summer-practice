package ru.example.users.facade;

import org.springframework.validation.annotation.Validated;
import ru.example.users.dto.ReviewDto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface ReviewFacade {
    ReviewDto addReview(@Valid ReviewDto reviewDto);

    List<ReviewDto> getReviewsByBookId(@NotNull Integer bookId);
}
