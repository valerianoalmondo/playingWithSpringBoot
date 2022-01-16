# playintWithSpringBoot

## Setting project

### Project Overview

- Creating diagram to understand the whole picture of project in my mind: http://draw.io.

<img src="https://user-images.githubusercontent.com/70283310/149668911-ecf5eeef-c3a8-4805-b61e-53ec906a1d1e.png">

- Choosing to create this project with Spring initializr to make it fast and simple as possible: https://start.spring.io.

Specifically:

WEB
- Spring Web (Build web, including ERSTful, applications using Spring MVC, Uses Apache Tomcat as the default embedded container).

SQL
- Spring Data JPA (Persist data in SQL with Java Persistence API using Spring Data and Hybernate).
- PostgreSQL Driver
A JDBC and R2DBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code.

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

@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Adam",
						"adam.larysz@gamil.com",
						LocalDate.of(2000, Month.JANUARY, 11),
						32
						)
		);
	}
