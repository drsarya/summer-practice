package ru.example.users.db.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "review")
    String textReview;

    @Column(name = "book_id")
    Integer bookId;
    @Column(name = "user_id")
    Integer userId;
}
