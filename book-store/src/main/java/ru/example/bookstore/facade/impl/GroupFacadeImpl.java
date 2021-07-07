package ru.example.bookstore.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.bookstore.dto.BookGroupDto;
import ru.example.bookstore.dto.GroupDto;
import ru.example.bookstore.facade.GroupFacade;
import ru.example.bookstore.service.GroupService;

import javax.validation.Valid;

@Service
public class GroupFacadeImpl implements GroupFacade {
    private final GroupService groupService;

    @Autowired
    public GroupFacadeImpl(GroupService groupService) {
        this.groupService = groupService;
    }

    @Override
    public void createGroup() {
        groupService.createGroup();
    }

    @Override
    public void addBookToGroup(@Valid BookGroupDto bookGroupDto) {
        groupService.addBookToGroup(bookGroupDto);
    }
}
