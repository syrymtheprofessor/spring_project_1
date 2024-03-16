package com.example.students_in_springboot.service;

import com.example.students_in_springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

// Service используется вне бизнес логики, реализация описана вне контроллера.
// Не хотим монолитную систему, а делить все по сервисам.
public interface StudentService {
    List<Student> getAllStudents();



    Student addStudent(Student student);
    Student getStudent(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
