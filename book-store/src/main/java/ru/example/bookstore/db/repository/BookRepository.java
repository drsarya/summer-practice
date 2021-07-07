package ru.example.bookstore.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.bookstore.db.entity.Book;


public interface BookRepository extends CrudRepository<Book, Integer> {
}
