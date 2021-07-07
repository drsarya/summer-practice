
drop table IF EXISTS users;
drop table IF EXISTS user_reviews;



create TABLE users
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(300) NOT NULL,
    UNIQUE (username )
);

create TABLE user_reviews
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    book_id INT NOT NULL,
    review VARCHAR(300) NOT NULL,
    CONSTRAINT user_reviews_user_id FOREIGN KEY (user_id) REFERENCES users (id)
);

insert into users (id, username )
values (1, 'User 1' ),
       (2, 'User 2' ),
       (3, 'User 3' ),
       (4, 'User 4' ),
       (5, 'User 5' );

insert into user_reviews (id, user_id,book_id, review  )
values (1, 1, 1, 'Гипер-классная книга!!' ),
       (2, 2, 2, 'Замечтальная книга!'),
       (3, 3, 3, 'Очень странный сюжет'),
       (4, 4, 4, 'Почерпнула для себя много нового' ),
       (5, 3, 5, 'Буду перечитывать не один раз!!'),
       (6, 4, 1, 'Не очень...' ),
       (7, 3, 2, 'Очень понравилось!!' ),
       (8, 4, 3, 'Столько сюжетных поворотов!!' ),
       (9, 5, 4, 'Скучная!!');

