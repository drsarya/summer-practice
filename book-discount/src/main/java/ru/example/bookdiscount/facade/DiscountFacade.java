package ru.example.bookdiscount.facade;

import org.springframework.validation.annotation.Validated;
import ru.example.bookdiscount.dto.DiscountDto;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.List;

@Validated
public interface DiscountFacade {
    List<DiscountDto> getAllDiscounts();

    void create(@Valid DiscountDto discountDto);

    BigDecimal getDiscountByGroupName(String name);
}
