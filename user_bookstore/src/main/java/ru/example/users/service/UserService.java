package ru.example.users.service;

import ru.example.users.db.entity.User;
import ru.example.users.dto.UserDto;

public interface UserService {
    User addUser(UserDto userDto);
}
