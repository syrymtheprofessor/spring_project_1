package com.example.students_in_springboot.service;

import com.example.students_in_springboot.model.User;

import java.util.List;

// Service используется вне бизнес логики, реализация описана вне контроллера.
// Не хотим монолитную систему, а делить все по сервисам.
public interface UserService {
    List<User> getAllUsers();

    User addUser(User user);
    User getUser(String email);
    User updateUser(User user);
    void deleteUser (String email);
}
