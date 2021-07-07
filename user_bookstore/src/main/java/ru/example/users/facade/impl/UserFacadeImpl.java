package ru.example.users.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.users.db.entity.User;
import ru.example.users.dto.UserDto;
import ru.example.users.facade.UserFacade;
import ru.example.users.service.UserService;
@Service
public class UserFacadeImpl implements UserFacade {
    private final UserService userService;

    @Autowired
    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }
    @Override
    public UserDto addUser(UserDto userDto) {
        return userService.addUser(userDto);
    }
}
