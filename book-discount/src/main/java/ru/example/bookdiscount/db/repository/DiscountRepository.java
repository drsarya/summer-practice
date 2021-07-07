package ru.example.bookdiscount.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.bookdiscount.db.entity.Discount;

import java.util.List;

public interface DiscountRepository extends CrudRepository<Discount, Integer> {
}
