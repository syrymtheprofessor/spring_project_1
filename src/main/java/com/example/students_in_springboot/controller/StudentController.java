package com.example.students_in_springboot.controller;

import com.example.students_in_springboot.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.students_in_springboot.model.Student;

import java.util.List;

@RestController //@ResponseBody десериализует данные с JSON формата в Java. Мог использовать @Controller
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {
    private StudentService service;

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping("add_student")
    public Student addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @GetMapping("/{email_url}")
    public Student getStudent(@PathVariable("email_url") String email) {
        return service.getStudent(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) { //@PathVariable не надо писать в скобки, так как имя такое же
        service.deleteStudent(email);
    }

}
