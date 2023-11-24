# Spring Security with JWT

## Description

This project is a simple example of how to use Spring Security with JWT.

## Dependencies

- Java 
- Maven
- Spring Web
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- DevTools
- Lombok

## Features

- Login
- Register
- Get all users
- Get user by id
- Update user
- Delete user
- Refresh token
- Role based authorization

## Docker

- MySQL
    
```bash
docker run --name mysql -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=jwt -p 3306:3306 -d mysql:latest
```

## Usage

- Clone the repository

```bash
git clone
```

- Run the application

```bash
mvn spring-boot:run
```

## Endpoints

- Login

```bash
POST http://localhost:8080/api/auth/login
```

- Register

```bash
POST http://localhost:8080/api/auth/register
```

- Get all users

```bash
GET http://localhost:8080/api/users
```

- Get user by id

```bash
GET http://localhost:8080/api/users/{id}
```

- Update user

```bash
PUT http://localhost:8080/api/users/{id}
```

- Delete user

```bash
DELETE http://localhost:8080/api/users/{id}
```