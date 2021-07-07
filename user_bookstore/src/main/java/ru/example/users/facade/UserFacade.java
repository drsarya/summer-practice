package ru.example.users.facade;

import ru.example.users.db.entity.User;
import ru.example.users.dto.UserDto;

public interface UserFacade {
   User addUser(UserDto userDto);
}
