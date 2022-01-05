package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                "Mariam",
                    LocalDate.of(2000, JANUARY, 5),
                    "mariam@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2004, JANUARY, 5),
                    "alex@gmail.com"
            );

            studentRepository.saveAll(List.of(mariam, alex));
        };

    }
}
