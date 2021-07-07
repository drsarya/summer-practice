package ru.example.bookdiscount.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.bookdiscount.db.entity.Discount;
import ru.example.bookdiscount.dto.DiscountDto;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface DiscountMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "groupName", source = "groupName")
    @Mapping(target = "percent", source = "percent")
    DiscountDto discountToDiscountDto(Discount discount);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "groupName", source = "groupName")
    @Mapping(target = "percent", source = "percent")
    Discount discountDtoToDiscount(DiscountDto discountDto);

    default List<DiscountDto> toListReviewDto(List<Discount> list) {
        return list
                .stream()
                .map(this::discountToDiscountDto)
                .collect(Collectors.toList());
    }
}
