package ru.example.bookstore.service;

import ru.example.bookstore.db.entity.Group;
import ru.example.bookstore.dto.BookGroupDto;
import ru.example.bookstore.dto.GroupDto;


public interface GroupService {
    void createGroup();

    void addBookToGroup(BookGroupDto bookGroupDto);
}
