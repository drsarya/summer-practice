package ru.example.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.example.bookstore.handler.ValidationErrorTerms;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookGroupDto {
    @JsonProperty
    private Integer id;

    @JsonProperty
    @NotNull(message = ValidationErrorTerms.BOOK_ID_MUST_BE_SET)
    private Integer bookId;

    @JsonProperty
    @NotNull(message = ValidationErrorTerms.NAME_MUST_BE_SET)
    private Integer nameGroupId;
}
