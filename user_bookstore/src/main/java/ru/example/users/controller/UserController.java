package ru.example.users.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.example.users.dto.UserDto;


@RestController
@RequestMapping(path = "/user", produces = "application/json")
public class UserController {

    ResponseEntity addUser(UserDto userDto) {
        return new ResponseEntity<>("json", HttpStatus.OK);
    }

}
