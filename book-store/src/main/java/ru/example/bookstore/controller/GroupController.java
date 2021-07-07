package ru.example.bookstore.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.example.bookstore.dto.BookGroupDto;
import ru.example.bookstore.facade.GroupFacade;

@RestController
@RequestMapping(value = "/group", produces = "application/json")
@Slf4j
public class GroupController {
    private final GroupFacade groupFacade;

    public GroupController(GroupFacade groupFacade) {
        this.groupFacade = groupFacade;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createGroup() {
        groupFacade.createGroup();
    }

    @PostMapping(value = "/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    void addBookToGroup(@RequestBody BookGroupDto bookGroupDto) {
        groupFacade.addBookToGroup(bookGroupDto);
    }
}
