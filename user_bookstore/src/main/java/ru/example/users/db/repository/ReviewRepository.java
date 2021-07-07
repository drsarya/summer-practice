package ru.example.users.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.users.db.entity.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
