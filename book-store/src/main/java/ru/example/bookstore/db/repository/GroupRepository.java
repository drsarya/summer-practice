package ru.example.bookstore.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.bookstore.db.entity.Group;


public interface GroupRepository extends CrudRepository<Group, Integer> {
    Group findFirstByName(String name);
}
