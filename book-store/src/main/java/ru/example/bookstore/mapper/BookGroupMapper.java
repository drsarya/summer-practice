package ru.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.bookstore.db.entity.BookGroup;
import ru.example.bookstore.dto.BookGroupDto;

@Mapper(componentModel = "spring")
public interface BookGroupMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "bookId", source = "bookId")
    @Mapping(target = "nameGroupId", source = "nameGroupId")
    BookGroupDto bookGroupToBookGroupDto(BookGroup group);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "bookId", source = "bookId")
    @Mapping(target = "nameGroupId", source = "nameGroupId")
    BookGroup bookGroupDtoToBookGroup(BookGroupDto groupDto);
}
