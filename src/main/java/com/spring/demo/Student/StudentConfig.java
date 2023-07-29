package com.spring.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mark = new Student(
                 "Mark", 1L, LocalDate.of(2000, Month.APRIL,2)
            );
            Student anne = new Student(
                    "Anne", 2L, LocalDate.of(2001, Month.APRIL,2)
            );

            repository.saveAll(List.of(mark,anne));
        };
    }
}
