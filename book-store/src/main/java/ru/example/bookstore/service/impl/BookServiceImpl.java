package ru.example.bookstore.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.bookstore.db.entity.Book;
import ru.example.bookstore.db.repository.BookRepository;
import ru.example.bookstore.dto.BookDto;
import ru.example.bookstore.handler.ValidationErrorTerms;
import ru.example.bookstore.mapper.BookMapper;
import ru.example.bookstore.service.BookService;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final DiscountService discountService;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, DiscountService discountService, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.discountService = discountService;
        this.bookMapper = bookMapper;

    }

    @Override
    public void createBook(BookDto bookDto) {
        Book book = bookMapper.toBook(bookDto);
        bookRepository.save(book);
    }

    @Override
    public BookDto getBookById(Integer id) {
        if (bookRepository.findById(id).isPresent())
            return bookMapper.toBookDto(bookRepository.findById(id).get());
        else throw new IllegalArgumentException(ValidationErrorTerms.BOOK_NOT_FOUND);
    }

    @Override
    public List<BookDto> getBooks() {
        return bookMapper.toListReviewDto((List<Book>) bookRepository.findAll());
    }

}
