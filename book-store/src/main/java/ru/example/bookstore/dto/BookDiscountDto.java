package ru.example.bookstore.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.example.bookstore.db.entity.Book;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDiscountDto {

    @JsonProperty
    private Integer discount;
    @JsonProperty
    private String groupName;
    @JsonProperty
    private BookDto book;
}
