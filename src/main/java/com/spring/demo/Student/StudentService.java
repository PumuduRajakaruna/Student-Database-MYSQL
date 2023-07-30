package com.spring.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {

    private static StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public static void addStudent(Student student) {
        Optional<Student> studentById = studentRepository.findStudentById(student.getId());
        if (studentById.isPresent()){
            throw new IllegalStateException("name taken");
        }
        studentRepository.save(student);

        System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("student id with "+ studentId + "does not exist");
        }
        studentRepository.deleteById(studentId);
    }
    @Transactional
    public void updateStudent(Long studentId, String Fname) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException("student with id "+ studentId+ " does not exist"));
        if (Fname != null && Fname.length() > 0 && !Objects.equals(student.getFname(), Fname)){
            student.setFname(Fname);
        }
    }
}
