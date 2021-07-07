package ru.example.bookdiscount.facade.impl;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.example.bookdiscount.dto.DiscountDto;
import ru.example.bookdiscount.facade.DiscountFacade;
import ru.example.bookdiscount.service.DiscountService;

import javax.validation.Valid;
import java.util.List;

@Service
public class DiscountFacadeImpl implements DiscountFacade {

    private final DiscountService discountService;

    public DiscountFacadeImpl(DiscountService discountService) {
        this.discountService = discountService;
    }

    @Override
    public List<DiscountDto> getAllDiscounts() {
        return discountService.getAllDiscounts();
    }

    @Override
    public void create(@Valid DiscountDto discountDto) {
        discountService.create(discountDto);
    }
}
