package com.example.students_in_springboot.service.implementation;

import com.example.students_in_springboot.model.Student;
import com.example.students_in_springboot.repository.InMemoryStudentDAO;
import com.example.students_in_springboot.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Аннотация @Service в Spring Framework используется для пометки класса как компонента сервиса.
Она обычно используется для обозначения сервисных классов, которые содержат бизнес-логику приложения.

Когда вы помечаете класс аннотацией @Service, Spring автоматически сканирует его и
создает экземпляр этого класса в контексте приложения.
 */
@Service
@AllArgsConstructor
public class InMemoryStudentServiceImp implements StudentService{
    private final InMemoryStudentDAO repository; //В моем случае вот экземпляр этот класса

    @Override
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    @Override
    public Student addStudent(Student student) {
        return repository.addStudent(student);
    }

    @Override
    public Student getStudent(String email) {
        return repository.getStudent(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
