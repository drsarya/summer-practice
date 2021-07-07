package ru.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.bookstore.db.entity.Book;
import ru.example.bookstore.dto.BookDto;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface BookMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "author", source = "author")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "price", source = "price")
    BookDto toBookDto(Book book);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "author", source = "author")
    @Mapping(target = "title", source = "title")
    @Mapping(target = "price", source = "price")
    Book toBook(BookDto book);

    default List<BookDto> toListReviewDto(List<Book> list) {
        return list
                .stream()
                .map(this::toBookDto)
                .collect(Collectors.toList());
    }
}
