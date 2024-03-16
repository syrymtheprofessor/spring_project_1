package com.example.students_in_springboot.service.implementation;

import com.example.students_in_springboot.model.Student;
import com.example.students_in_springboot.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentServiceImp implements StudentService{
    @Override
    public List<Student> getAllStudents() {
        return List.of(
                Student.builder().firstName("Test").lastName("Test2").age(13).email("Test@mail.ru").build(),
                Student.builder().firstName("Test").lastName("Test2").age(13).email("Test@mail.ru").build(),
                Student.builder().firstName("Test").lastName("Test2").age(13).email("Test@mail.ru").build()
        );
    }

    @Override
    public Student addStudent(Student student) {
        return null;
    }

    @Override
    public Student getStudent(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {

    }

}
