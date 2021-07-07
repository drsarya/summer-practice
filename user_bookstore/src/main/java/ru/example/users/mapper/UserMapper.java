package ru.example.users.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.users.db.entity.User;
import ru.example.users.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "userName", source = "userName")
    @Mapping(target = "id", source = "id")
    UserDto userToUserDto(User user);

    @Mapping(target = "userName", source = "userName")
    @Mapping(target = "id", source = "id")
    User userDtoToUser(UserDto userDto);
}
