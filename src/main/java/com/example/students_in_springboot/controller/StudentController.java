package com.example.students_in_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.students_in_springboot.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                Student.builder().firstName("Test").lastName("Test2").age(13).email("Test@mail.ru").build(),
                Student.builder().firstName("Test").lastName("Test2").age(13).email("Test@mail.ru").build(),
                Student.builder().firstName("Test").lastName("Test2").age(13).email("Test@mail.ru").build()
        );
    }
}
