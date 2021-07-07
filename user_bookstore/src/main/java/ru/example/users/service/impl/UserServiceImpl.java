package ru.example.users.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.example.users.db.entity.User;
import ru.example.users.db.repository.UserRepository;
import ru.example.users.dto.UserDto;
import ru.example.users.mapper.UserMapper;
import ru.example.users.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = userMapper.userDtoToUser(userDto);
        return  userMapper.userToUserDto(userRepository.save(user));
    }
}
