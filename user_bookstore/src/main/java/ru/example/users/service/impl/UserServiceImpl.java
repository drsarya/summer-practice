package ru.example.users.service.impl;

import org.springframework.stereotype.Service;
import ru.example.users.db.entity.User;
import ru.example.users.dto.UserDto;
import ru.example.users.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User addUser(UserDto userDto) {
        return null;
    }
}
