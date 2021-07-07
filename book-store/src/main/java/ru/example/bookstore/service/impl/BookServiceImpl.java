package ru.example.bookstore.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.bookstore.db.entity.Book;
import ru.example.bookstore.db.entity.BookGroup;
import ru.example.bookstore.db.entity.Group;
import ru.example.bookstore.db.repository.BookGroupRepository;
import ru.example.bookstore.db.repository.BookRepository;
import ru.example.bookstore.db.repository.GroupRepository;
import ru.example.bookstore.dto.BookDiscountDto;
import ru.example.bookstore.dto.BookDto;
import ru.example.bookstore.handler.ValidationErrorTerms;
import ru.example.bookstore.mapper.BookMapper;
import ru.example.bookstore.service.BookService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final GroupRepository groupRepository;
    private final DiscountService discountService;
    private final BookGroupRepository bookGroupRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, GroupRepository groupRepository, DiscountService discountService, BookGroupRepository bookGroupRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.groupRepository = groupRepository;
        this.discountService = discountService;
        this.bookGroupRepository = bookGroupRepository;
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

    @Override
    public List<BookDiscountDto> getGroupBooksWithDiscounts(boolean isApplied) {
        List<Group> groups = (List<Group>) groupRepository.findAll();

        List<BookDiscountDto> discountDtos = new ArrayList<>();
        for (Group group : groups) {
            Integer valueDisc = Math.abs(discountService.getDiscount(group.getName()));
            List<BookGroup> booksFromGroup = bookGroupRepository.findAllByNameGroupId(group.getId());
            for (BookGroup groupBook : booksFromGroup) {
                Book book = bookRepository.findById(groupBook.getBookId()).get();
                if (isApplied) {
                    BigDecimal newPrice = book.getPrice().subtract(book.getPrice().multiply(BigDecimal.valueOf(valueDisc).divide(BigDecimal.valueOf(100))));
                    if (newPrice.intValue() <= 0) {
                        book.setPrice(BigDecimal.valueOf(0));
                    } else {
                        book.setPrice(newPrice);
                    }
                }
                BookDto bookDto = bookMapper.toBookDto(book);
                BookDiscountDto bookDiscountDto = new BookDiscountDto(valueDisc, group.getName(), bookDto);
                discountDtos.add(bookDiscountDto);
            }
        }
        return discountDtos;
    }


}
