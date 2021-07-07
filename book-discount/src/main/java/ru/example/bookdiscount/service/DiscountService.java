package ru.example.bookdiscount.service;

import ru.example.bookdiscount.dto.DiscountDto;

import java.math.BigDecimal;
import java.util.List;

public interface DiscountService {
    List<DiscountDto> getAllDiscounts();

    void create(DiscountDto discountDto);

    BigDecimal getDiscountByGroupName(String name);
}
