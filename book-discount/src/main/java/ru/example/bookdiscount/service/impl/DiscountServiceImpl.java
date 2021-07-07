package ru.example.bookdiscount.service.impl;

import org.springframework.stereotype.Service;
import ru.example.bookdiscount.db.entity.Discount;
import ru.example.bookdiscount.db.repository.DiscountRepository;
import ru.example.bookdiscount.dto.DiscountDto;
import ru.example.bookdiscount.mapper.DiscountMapper;
import ru.example.bookdiscount.service.DiscountService;

import java.math.BigDecimal;
import java.util.List;

import static ru.example.bookdiscount.handler.ValidationErrorTerms.ERROR_OF_PERCENT_VALUE;
import static ru.example.bookdiscount.handler.ValidationErrorTerms.GROUP_NOT_FOUND;

@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepository discountRepository;
    private final DiscountMapper discountMapper;

    public DiscountServiceImpl(DiscountRepository discountRepository, DiscountMapper discountMapper) {
        this.discountRepository = discountRepository;
        this.discountMapper = discountMapper;
    }

    @Override
    public List<DiscountDto> getAllDiscounts() {
        return discountMapper.toListReviewDto((List<Discount>) discountRepository.findAll());
    }

    @Override
    public void create(DiscountDto discountDto) {
        if (discountDto.getPercent().intValue() < 0)
            throw new IllegalArgumentException(ERROR_OF_PERCENT_VALUE);
        discountRepository.save(discountMapper.discountDtoToDiscount(discountDto));
    }

    @Override
    public BigDecimal getDiscountByGroupName(String name) {
        Discount discount = discountRepository.findFirstByGroupName(name);
        if (discount != null) return discount.getPercent();
        throw new IllegalArgumentException(GROUP_NOT_FOUND);
    }
}
