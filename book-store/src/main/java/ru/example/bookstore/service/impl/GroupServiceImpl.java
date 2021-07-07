package ru.example.bookstore.service.impl;

import org.springframework.stereotype.Service;
import ru.example.bookstore.db.entity.BookGroup;
import ru.example.bookstore.db.entity.Group;
import ru.example.bookstore.db.repository.BookGroupRepository;
import ru.example.bookstore.db.repository.GroupRepository;
import ru.example.bookstore.dto.BookGroupDto;
import ru.example.bookstore.dto.GroupDto;
import ru.example.bookstore.handler.ValidationErrorTerms;
import ru.example.bookstore.mapper.BookGroupMapper;
import ru.example.bookstore.mapper.GroupMapper;
import ru.example.bookstore.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {
    private final GroupMapper groupMapper;
    private final BookGroupMapper bookGroupMapper;
    private final GroupRepository groupRepository;
    private final BookGroupRepository bookGroupRepository;

    public GroupServiceImpl(GroupMapper groupMapper, BookGroupMapper bookGroupMapper, GroupRepository groupRepository, BookGroupRepository bookGroupRepository) {
        this.groupMapper = groupMapper;
        this.bookGroupMapper = bookGroupMapper;
        this.groupRepository = groupRepository;
        this.bookGroupRepository = bookGroupRepository;
    }

    private String generateGroupName() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }

    @Override
    public void createGroup( ) {
        String name = generateGroupName();
        while (groupRepository.findFirstByName(name) != null) {
            name = generateGroupName();
        }
        groupRepository.save(new Group(name));
    }

    @Override
    public void addBookToGroup(BookGroupDto bookGroupDto) {
        if (!groupRepository.existsById(bookGroupDto.getNameGroupId()))
            throw new IllegalArgumentException(ValidationErrorTerms.GROUP_NOT_FOUND);
        BookGroup bookGroup = bookGroupMapper.bookGroupDtoToBookGroup(bookGroupDto);
        bookGroupRepository.save(bookGroup);
    }
}
