drop table IF EXISTS discount;

create TABLE discount
(
    id     INT AUTO_INCREMENT PRIMARY KEY,
    group_name VARCHAR(10) NOT NULL,
    discount_value DECIMAL NOT NULL
);

insert into discount(id, group_name, discount_value)
values (1, 'abc111',  12 ),
       (2, 'abc123',  13 ),
       (3, 'abvc123', 50 ),
       (4, 'rew123',  14 ),
       (5, 'U78tre',  23 );

