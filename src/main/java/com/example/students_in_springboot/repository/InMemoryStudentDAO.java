package com.example.students_in_springboot.repository;

import com.example.students_in_springboot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Почему реализация методов не прописывается в InMemoryStudentServiceImp?

Принцип разделения ответственности (Separation of Concerns) предписывает разделять бизнес-логику от доступа к данным.
Это означает, что классы, отвечающие за бизнес-логику, и классы, отвечающие за доступ к данным,
должны быть отделены друг от друга. Такой подход упрощает тестирование, поддержку и масштабирование приложения.

В вашем случае, InMemoryStudentDAO отвечает исключительно за доступ к данным,
а InMemoryStudentServiceImp - за бизнес-логику приложения, которая использует InMemoryStudentDAO для доступа к данным.
Это делает код более модульным, понятным и легко поддающимся изменениям,
поскольку логика доступа к данным и бизнес-логика разделены и могут изменяться независимо друг от друга.
 */
@Repository
public class InMemoryStudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> getAllStudents() {
        return STUDENTS;
    }

    public Student addStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student getStudent(String email) {
        return STUDENTS.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);

        if (studentIndex > -1) {
            STUDENTS.set(studentIndex, student);
            return student;
        }

        return null;
    }

    public void deleteStudent(String email) {
        var student = getStudent(email);
        if (student != null) {
            STUDENTS.remove(student);
        }
    }
}
