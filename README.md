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

- Просмотр стоимости книг, принадлежащих группе с учетом скидки.
## Book-Discount (скидки)  
- Получение скидки по названию группы

- Просмотр всех скидок

- Создание скидок


## Решение вопросов из задания:
_"Группа может обозначаться набором букв и цифр длинной до 10 символов."_ - Создан метод для генерации названия группы книг с логикой повторного создания названия, если текущее уже существует.

_"Предусмотреть применение полученных скидок перед отдачей списка книг из сервиса BookStore."_ - Для этого нужно указать буленовское значение: **true** - учитывать скидку, **false** - не учитывать

_"Предусмотреть ситуацию, когда для некоторых групп скидки не предусмотрены."_ - Для этого нужно указать величину скидки 0 процентов.

_"Предусмотреть ситуацию, когда сервис скидок не доступен."_ - обработка connect-исключения.
 
 
 В дополнение была добавлена валидация моделей, если какое-либо из необходимых полей не указано. 
 Код лежит в ветке master.
 
