# CryptoShop - Магазин криптовалют

## Описание проекта
CryptoShop - это интернет-магазин криптовалют, разработанный на Spring Boot. Основные возможности:

- Регистрация и аутентификация пользователей
- Просмотр каталога криптовалют
- Добавление товаров в корзину
- Оформление и отслеживание заказов
- История покупок

## Технологии
- **Бэкенд**:
    - Spring Boot 3.x
    - Spring Security
    - Spring Data JPA
- **Фронтенд**:
    - Thymeleaf
    - Bootstrap
- **База данных**:
    - H2 (встроенная) / MySQL
- **Дополнительно**:
    - Lombok
    - Jakarta Validation
    - SLF4J

## Функциональность
 - Главная страница - обзор магазина
 - Магазин - просмотр доступных криптовалют
 - Корзина - управление выбранными товарами
 - Заказы - история покупок
 - Авторизация - вход/регистрация

## Разработчики:
- **Яковлев Савелий Констанович** - безопасность + заказы + пользователи
    - config/ SecurityConfiguration
    - controllers/ OrderController
    - service/: OrderService, UserService
    - repository/: OrderRepository, UserRepository
    - entities/: Authority, Order, OrderItem, User
    - application.properties (настройки безопасности, базы данных)

- **Казанцев Никита Андреевич** - frontend + базовые сервисы
    - templates/: (все HTML-файлы):
    - controllers/: (Main, Shop, Cart)
    - service/: ProductService
    - repository/: ProductRepository
    - entities/: Crypto




