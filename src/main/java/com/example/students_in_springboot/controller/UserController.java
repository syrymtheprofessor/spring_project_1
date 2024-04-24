package com.example.students_in_springboot.controller;

import com.example.students_in_springboot.model.User;
import com.example.students_in_springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //@ResponseBody десериализует данные с JSON формата в Java. Мог использовать @Controller
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
    private UserService service;

    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @PostMapping("add_user")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    @GetMapping("/{email_url}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public User getUser(@PathVariable("email_url") String email) {
        return service.getUser(email);
    }

    @PutMapping("update_user")
    public User updateUser(@RequestBody User user) {
        return service.updateUser(user);
    }

    @DeleteMapping("delete_user/{email}")
    public void deleteUser(@PathVariable String email) { //@PathVariable не надо писать в скобки, так как имя такое же
        service.deleteUser(email);
    }
}
