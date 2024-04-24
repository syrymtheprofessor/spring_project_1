package com.example.students_in_springboot.repository;

import com.example.students_in_springboot.StudentsInSpringboot;
import com.example.students_in_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteByEmail (String email);
    User findUserByEmail (String email);
}


