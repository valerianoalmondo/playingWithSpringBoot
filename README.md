# playintWithSpringBoot

## Project Overview

- Creating diagram to understand the whole picture of the project in my mind: http://draw.io.

<img src="https://user-images.githubusercontent.com/70283310/149668911-ecf5eeef-c3a8-4805-b61e-53ec906a1d1e.png">

- Choosing to create this project with Spring initializr to make it fast and simple as possible: https://start.spring.io.

Specifically:

WEB
- Spring Web (Build web, including ERSTful, applications using Spring MVC, Uses Apache Tomcat as the default embedded container).

SQL
- Spring Data JPA (Persist data in SQL with Java Persistence API using Spring Data and Hybernate).
- PostgreSQL Driver
A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.

## Setting project

### Starting the server

- Commenting JPA dependency to start program without errors
<!--		<dependency>-->
<!--			<groupId>org.springframework.boot</groupId>-->
<!--			<artifactId>spring-boot-starter-data-jpa</artifactId>-->
<!--		</dependency>-->

### Creating simple API

@SpringBootApplication

@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<String> hello() {
		return List.of("Hello", "Spring");
	}
}

### Creating student class

- Creating package and class called Student
- Creating list of Students in main class

### Creating API Layer

- Organize code for better understanding and overview

### Business Layer

- Adding Business (service) layer. Anterior design pattern.

### Dependency injection

- Split things into layers. API layer talk with Service layer & vice versa

### Properties file

- Configurating connection to database

### Creating & connecting to database

- Creating a Postgres database called student

### JPA & @Entity

- Preparing project to connect it with Database

### JPA in action

- Connecting project with Database

### JPA repository

- Implementing the data access layer

### Saving students

- Filling our repository with students

### Transient

- Calculate age based on the date of birth

### Post mapping



