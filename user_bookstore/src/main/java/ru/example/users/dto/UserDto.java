package ru.example.users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Immutable
public class UserDto {
    private Integer id;
    private String userName;
}
