# Spring Security with JWT

## Description

This project is a simple example of how to use Spring Security with JWT.

## Dependencies

- Java 
- Maven
- Spring Web
- Spring Boot
- Spring Security
- JPA
- H2
- Json Web Token

## Features

- Login
- Register
- Get all users
- Get user by username
- Get user by email
- Role based authorization

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

- Get user by username

```bash
GET http://localhost:8080/api/users/{username}
```

- Get user by email

```bash
GET http://localhost:8080/api/users/{email}
```
