package ru.example.users.db.repository;

import org.springframework.data.repository.CrudRepository;
import ru.example.users.db.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
