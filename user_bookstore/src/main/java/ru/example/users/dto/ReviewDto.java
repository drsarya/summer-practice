package ru.example.users.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import ru.example.users.handler.ValidationErrorTerms;


import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {

    @JsonProperty
    Integer id;

    @NotNull(message = ValidationErrorTerms.NAME_MUST_BE_SET)
    @JsonProperty
    String textReview;

    @NotNull(message = ValidationErrorTerms.BOOK_ID_MUST_BE_SET)
    @JsonProperty
    Integer bookId;

    @NotNull(message = ValidationErrorTerms.USER_ID_MUST_BE_SET)
    @JsonProperty
    Integer userId;

}
