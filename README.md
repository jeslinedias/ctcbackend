# Spring Boot Login example with Spring Security, MySQL and JWT

Build a Spring Boot Login and Registration example (Rest API) that supports JWT with HttpOnly Cookie. You’ll know:

- Appropriate Flow for User Login and Registration with JWT and HttpOnly Cookies
- Spring Boot Rest Api Architecture with Spring Security
- How to configure Spring Security to work with JWT
- How to define Data Models and association for Authentication and Authorization
- Way to use Spring Data JPA to interact with MySQL Database

## User Registration, Login and Authorization process.

![spring-boot-login-example-flow](spring-boot-login-example-flow.png)

## Spring Boot Server Architecture with Spring Security

You can have an overview of our Spring Boot Server with the diagram below:

![spring-boot-login-example-architecture](spring-boot-login-example-architecture.png)

> [React](https://www.bezkoder.com/react-login-example-jwt-hooks/) / [React Redux](https://www.bezkoder.com/redux-toolkit-auth/)

## Dependency

- MySQL:

```xml
<dependency>
  <groupId>com.mysql</groupId>
  <artifactId>mysql-connector-j</artifactId>
  <scope>runtime</scope>
</dependency>
```

## Configure Spring Datasource, JPA, App properties

Open `src/main/resources/application.properties`

- For MySQL

```
spring.datasource.url= jdbc:mysql://localhost:3306/testdb?useSSL=false
spring.datasource.username= root
spring.datasource.password= 123456

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
bezkoder.app.jwtCookieName= bezkoder
bezkoder.app.jwtSecret= ======================BezKoder=Spring===========================
bezkoder.app.jwtExpirationMs= 86400000
```

## Run Spring Boot application

```
mvn spring-boot:run
```

## Run following SQL insert statements

```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```

## Refresh Token

[Spring Boot Refresh Token with JWT example](https://www.bezkoder.com/spring-boot-refresh-token-jwt/)
