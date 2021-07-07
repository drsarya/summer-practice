package ru.example.bookdiscount.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.example.bookdiscount.handler.ValidationErrorTerms;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountDto {
    private Integer id;
    @NotNull(message = ValidationErrorTerms.GROUP_NAME_MUST_BE_SET)
    @JsonProperty
    private String groupName;
    @NotNull(message = ValidationErrorTerms.PERCENT_MUST_BE_SET)
    @JsonProperty
    private BigDecimal percent;
}
