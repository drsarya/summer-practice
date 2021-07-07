drop table IF EXISTS book;
drop table IF EXISTS group_name;
drop table IF EXISTS group_books;


create TABLE book
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    author VARCHAR(250) NOT NULL,
    title  VARCHAR(250) NOT NULL,
    price  DECIMAL NOT NULL,
    UNIQUE (  author,  title)
);
create TABLE group_name
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    name_group VARCHAR(10) NOT NULL ,
    UNIQUE (  name_group )
);

create TABLE group_books
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    book_id INT NOT NULL,
    name_group_id INT NOT NULL ,
    CONSTRAINT group_books_book_id FOREIGN KEY (book_id) REFERENCES book (id),
    CONSTRAINT group_books_name_group_id FOREIGN KEY (name_group_id) REFERENCES group_name (id),
    UNIQUE (book_id, name_group_id )
);


insert into book (id, author, title, price)
values (1, 'Author 1', 'Book 1', 100),
       (2, 'Author 2', 'Book 2', 500),
       (3, 'Author 3', 'Book 3', 400),
       (4, 'Author 4', 'Book 4', 300),
       (5, 'Author 5', 'Book 5', 200);

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