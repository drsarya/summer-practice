package ru.example.bookstore.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.bookstore.db.entity.BookGroup;

import java.util.List;

public interface BookGroupRepository extends CrudRepository<BookGroup, Integer> {
    List<BookGroup> findAllByNameGroupId(Integer groupId);
}
