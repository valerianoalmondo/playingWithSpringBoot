package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student adam = new Student(
                    "Adam",
                    "adam.larysz@gmail.com",
                    LocalDate.of(2000, JANUARY, 11)
            );

            Student eva = new Student(
                    "Eva",
                    "eva.larysz@gmail.com",
                    LocalDate.of(1999, JANUARY, 5)
            );

            repository.saveAll(
                    List.of(adam, eva)
            );
        };
    }

}
