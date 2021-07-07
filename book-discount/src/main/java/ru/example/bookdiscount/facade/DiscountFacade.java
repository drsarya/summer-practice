package ru.example.bookdiscount.facade;

import org.springframework.validation.annotation.Validated;
import ru.example.bookdiscount.dto.DiscountDto;

import javax.validation.Valid;
import java.util.List;

@Validated
public interface DiscountFacade {
    List<DiscountDto> getAllDiscounts();

    void create(@Valid DiscountDto discountDto);
}
