package ru.example.bookstore.facade.impl;

import org.springframework.stereotype.Service;
import ru.example.bookstore.dto.BookDiscountDto;
import ru.example.bookstore.dto.BookDto;
import ru.example.bookstore.facade.BookFacade;
import ru.example.bookstore.service.BookService;

import javax.validation.Valid;
import java.util.List;

@Service
public class BookFacadeImpl implements BookFacade {
    private final BookService bookService;

    public BookFacadeImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void createBook(@Valid BookDto bookDto) {
        bookService.createBook(bookDto);
    }

    @Override
    public BookDto getBookById(Integer id) {
        return bookService.getBookById(id);
    }

    @Override
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @Override
    public List<BookDiscountDto> getGroupBooksWithDiscounts(boolean isApplied) {
        return bookService.getGroupBooksWithDiscounts(isApplied);
    }
}
