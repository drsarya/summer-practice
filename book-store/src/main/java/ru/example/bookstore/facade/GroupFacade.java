package ru.example.bookstore.facade;

import org.springframework.validation.annotation.Validated;
import ru.example.bookstore.dto.BookGroupDto;
import ru.example.bookstore.dto.GroupDto;

import javax.validation.Valid;

@Validated
public interface GroupFacade {

    void createGroup();

    void addBookToGroup(@Valid BookGroupDto bookGroupDto);
}
