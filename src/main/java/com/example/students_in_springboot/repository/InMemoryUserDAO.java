package com.example.students_in_springboot.repository;

import com.example.students_in_springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
Почему реализация методов не прописывается в InMemoryUserServiceImp?

Принцип разделения ответственности (Separation of Concerns) предписывает разделять бизнес-логику от доступа к данным.
Это означает, что классы, отвечающие за бизнес-логику, и классы, отвечающие за доступ к данным,
должны быть отделены друг от друга. Такой подход упрощает тестирование, поддержку и масштабирование приложения.

В вашем случае, InMemoryUserDAO отвечает исключительно за доступ к данным,
а InMemoryUserServiceImp - за бизнес-логику приложения, которая использует InMemoryUserDAO для доступа к данным.
Это делает код более модульным, понятным и легко поддающимся изменениям,
поскольку логика доступа к данным и бизнес-логика разделены и могут изменяться независимо друг от друга.
 */
@Repository
public class InMemoryUserDAO {
    private final List<User> USERS = new ArrayList<>();

    public List<User> getAllUsers() {
        return USERS;
    }

    public User addUser(User user) {
        USERS.add(user);
        return user;
    }

    public User getUser(String email) {
        return USERS.stream()
                .filter(element -> element.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public User updateUser(User user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);

        if (userIndex > -1) {
            USERS.set(userIndex, user);
            return user;
        }

        return null;
    }

    public void deleteUser(String email) {
        var user = getUser(email);
        if (user != null) {
            USERS.remove(user);
        }
    }
}
