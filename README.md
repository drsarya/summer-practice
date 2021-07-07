# summer-practice
Repository for Java Summer Practice

В проекте содержатся следующие микросервисы: 

## User-BookStore (пользователи)
- создание пользователей,

- написание к книгам отзывов,

- получение отзывов по bookId.

## Book-Store (книги)
- Создание групп

- Добавление к группе книги

- Просмотр информации о книге

- Создание книг

- Просмотр всех книг

-Просмотр стоимости книг, принадлежащих группе с учетом скидки.
## Book-Discount (скидки)  
- Получение скидки по названию группы

- Просмотр всех скидок

- Создание скидок


## Решение вопросов из задания:
"Группа может обозначаться набором букв и цифр длинной до 10 символов." - Создан метод для генерации названия группы книг с логикой повторного создания названия, если текущее уже существует.

"Предусмотреть применение полученных скидок перед отдачей списка книг из сервиса BookStore." - Для этого нужно указать буленовское значение: true - учитывать скидку, false - не учитывать

"Предусмотреть ситуацию, когда для некоторых групп скидки не предусмотрены." - Для этого нужно указать величину скидки 0 процентов.

"Предусмотреть ситуацию, когда сервис скидок не доступен." - обработка connect-исключения.
 
 
