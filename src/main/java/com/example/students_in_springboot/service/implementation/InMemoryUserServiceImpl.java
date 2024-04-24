package com.example.students_in_springboot.service.implementation;

import com.example.students_in_springboot.model.User;
import com.example.students_in_springboot.repository.InMemoryUserDAO;
import com.example.students_in_springboot.service.UserService;
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
public class InMemoryUserServiceImpl implements UserService {
    private final InMemoryUserDAO repository; //В моем случае вот экземпляр этот класса

    @Override
    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }

    @Override
    public User addUser(User user) {
        return repository.addUser(user);
    }

    @Override
    public User getUser(String email) {
        return repository.getUser(email);
    }

    @Override
    public User updateUser(User user) {
        return repository.updateUser(user);
    }

    @Override
    public void deleteUser(String email) {
        repository.deleteUser(email);
    }

}
