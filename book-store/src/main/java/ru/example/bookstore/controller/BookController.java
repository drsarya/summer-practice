package ru.example.bookstore.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.example.bookstore.dto.BookDto;
import ru.example.bookstore.facade.BookFacade;

import java.util.List;

@RestController
@RequestMapping(value = "/book", produces = "application/json")
@Slf4j
public class BookController {
    private final BookFacade bookFacade;

    @Autowired
    public BookController(BookFacade bookFacade) {
        this.bookFacade = bookFacade;
    }

    @GetMapping
    public List<BookDto> getBooks() {
        return bookFacade.getBooks();
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Integer id) {
        log.info("User requested book with id: {} ", id);
        return bookFacade.getBookById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook(@RequestBody BookDto bookDto) {
        log.info("User created a book ");
        bookFacade.createBook(bookDto);
    }
}
