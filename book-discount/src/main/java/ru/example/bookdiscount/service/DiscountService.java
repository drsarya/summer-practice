package ru.example.bookdiscount.service;

import ru.example.bookdiscount.dto.DiscountDto;

import java.util.List;

public interface DiscountService {
    List<DiscountDto> getAllDiscounts();
    void create(DiscountDto discountDto);
}
