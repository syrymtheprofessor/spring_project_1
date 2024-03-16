package com.example.students_in_springboot.repository;

import com.example.students_in_springboot.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        if (student == null) {
            // todo
        }
    }

}
