drop table IF EXISTS book;
drop table IF EXISTS group_name;
drop table IF EXISTS group_books;
drop table IF EXISTS users_bookstore;
drop table IF EXISTS user_reviews;

create TABLE book
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(250) NOT NULL,
    title  VARCHAR(250) NOT NULL,
    price  DECIMAL NOT NULL
);
create TABLE group_name
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    name_group VARCHAR(10) NOT NULL,
    UNIQUE (  name_group )
);

create TABLE group_books
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    name_group_id INT NOT NULL,
    CONSTRAINT group_books_book_id FOREIGN KEY (book_id) REFERENCES book (id),
    CONSTRAINT group_books_name_group_id FOREIGN KEY (name_group_id) REFERENCES group_name (id),
    UNIQUE (book_id, name_group_id )
);

create TABLE users_bookstore
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(300) NOT NULL
);

create TABLE user_reviews
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    book_id INT NOT NULL,
    review VARCHAR(300) NOT NULL,
    CONSTRAINT user_reviews_user_id FOREIGN KEY (user_id) REFERENCES users_bookstore (id),
    CONSTRAINT user_reviews_book_id FOREIGN KEY (book_id) REFERENCES book (id)
    );
insert into book (id, author, title, price)
values (1, 'Author 1', 'Book 1', 100),
       (2, 'Author 2', 'Book 2', 500),
       (3, 'Author 3', 'Book 3', 400),
       (4, 'Author 4', 'Book 4', 300),
       (5, 'Author 5', 'Book 5', 200);
insert into users_bookstore (id, username )
values (1, 'User 1' ),
       (2, 'User 2' ),
       (3, 'User 3' ),
       (4, 'User 4' ),
       (5, 'User 5' );

insert into user_reviews (id, user_id,book_id, review  )
values (1, 1, 1, 'Гипер-классная книга!!' ),
       (2, 2, 2, 'Замечтальная книга!'),
       (3, 3, 3 , 'Очень странный сюжет'),
       (4, 4, 4, 'Подчерпнула для себя много нового' ),
       (5, 3, 5 , 'Буду перечитывать много раз!!'),
       (6, 4, 1, 'Не очень...' ),
       (7, 3, 2, 'Очень понравилось!!' ),
       (8, 4, 3, 'Столько сюжетных поворотов!!' ),
       (9, 5, 4, 'Скучная!!');

insert into group_name (id,  name_group  )
values
       (1, 'abc111' ),
       (2, 'abc123' ),
       (3, 'abvc123'),
       (4, 'rew123' ),
       (5, 'U78tre' );

insert into group_books (id, book_id,name_group_id  )
values (1, 1, 1),
       (2, 2, 1),
       (3, 3, 1),
       (4, 4, 1),
       (5, 1, 2),
       (6, 2, 2),
       (7, 3 ,2),
       (10, 2, 3),
       (11, 3, 3),
       (12, 4, 3),
       (13, 5, 3);