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
            Student student1 = new Student(
                 1L,"Mark","Miller",LocalDate.of(2013,Month.APRIL,23),21,"8","Negambo Road,Kurunegala","0701234567","Samarakoon"
            );
            Student student2 = new Student(
                    "Steve","Smith",LocalDate.of(2009,Month.MARCH,4),13,"6","Victoria, Melbourne","+63123456734","Smith"
            );

            repository.saveAll(List.of(student1));
            repository.saveAll(List.of(student2));
        };
    }
}
