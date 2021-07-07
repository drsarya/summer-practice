package ru.example.users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class ReviewDto {
    private Integer id;
    private String review;
    private Integer bookId;
    private Integer userId;
}
