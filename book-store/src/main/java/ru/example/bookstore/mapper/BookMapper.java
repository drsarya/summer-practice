package ru.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.bookstore.dto.BookDto;
import ru.example.bookstore.entity.Book;

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
}
