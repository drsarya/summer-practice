package ru.example.bookstore.facade;

import org.springframework.validation.annotation.Validated;
import ru.example.bookstore.dto.BookDiscountDto;
import ru.example.bookstore.dto.BookDto;

import javax.validation.Valid;
import java.util.List;

@Validated
public interface BookFacade {

    void createBook(@Valid BookDto bookDto);

    BookDto getBookById(Integer id);

    List<BookDto> getBooks();

    List<BookDiscountDto> getGroupBooksWithDiscounts(boolean isApplied);

}
