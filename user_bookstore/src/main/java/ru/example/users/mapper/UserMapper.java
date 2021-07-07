package ru.example.users.mapper;

import org.mapstruct.Mapper;
import ru.example.users.db.entity.User;
import ru.example.users.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);
}
