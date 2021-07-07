package ru.example.users.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.example.users.handler.ValidationErrorTerms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @JsonProperty
    Integer id;
    @JsonProperty
    @NotNull(message = ValidationErrorTerms.NAME_MUST_BE_SET)
    String userName;
}
