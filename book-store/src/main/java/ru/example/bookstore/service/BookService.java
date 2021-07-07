package ru.example.bookstore.service;

import ru.example.bookstore.dto.BookDiscountDto;
import ru.example.bookstore.dto.BookDto;

import javax.validation.Valid;
import java.util.List;

public interface BookService {
    void createBook(BookDto bookDto);

    BookDto getBookById(Integer id);

    List<BookDto> getBooks();

    List<BookDiscountDto> getGroupBooksWithDiscounts(boolean isApplied);
}
