package com.example.students_in_springboot.controller;

import com.example.students_in_springboot.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.students_in_springboot.model.Student;

import java.util.List;

@RestController //@ResponseBody сериализует данные в JSON формат. Мог использовать @Controller
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private StudentService service;

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}
