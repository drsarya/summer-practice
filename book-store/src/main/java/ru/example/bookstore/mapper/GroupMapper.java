package ru.example.bookstore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.example.bookstore.db.entity.Group;
import ru.example.bookstore.dto.GroupDto;

@Mapper(componentModel = "spring")
public interface GroupMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    GroupDto groupToGroupDto(Group group);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    Group groupDtoToGroup(GroupDto groupDto);

}
