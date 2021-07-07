package ru.example.bookstore.db.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "group_name")
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_group")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;

    public Group(String name) {
        this.name = name;
    }
}
