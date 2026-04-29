# Spring Boot API

![License](https://img.shields.io/badge/license-MIT-blue.svg) ![Version](https://img.shields.io/badge/version-1.0.0-green.svg)


Enterprise-grade REST API built with Spring Boot 3 and JPA.

## Features

- 🍃 Spring Boot 3.1
- 💾 Spring Data JPA with Hibernate
- 🧪 JUnit 5 & Mockito tests
- 📝 OpenAPI 3 documentation
- 🏗️ Layered architecture (Controller, Service, Repository)
- 🔐 Spring Security ready

## Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/products | List all products |
| GET | /api/products/:id | Get product by ID |
| POST | /api/products | Create new product |
| PUT | /api/products/:id | Update product |
| DELETE | /api/products/:id | Delete product |

## Testing

```bash
mvn test
```

## Project Structure

```
src/main/java/com/example/
├── controller/     # REST controllers
├── service/        # Business logic
├── repository/     # Data access layer
├── model/          # Entity classes
└── Application.java
```

## License

MIT
