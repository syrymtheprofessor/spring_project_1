package com.example.students_in_springboot.repository;

import com.example.students_in_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //для UserServiceImpl
    void deleteByEmail (String email);
    User findUserByEmail (String email);

    //для MyUserDetails
    Optional<User> findByEmail(String username);

}
