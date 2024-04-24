package com.example.students_in_springboot.config;

import com.example.students_in_springboot.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {
    private User user;
    public MyUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.stream(user.getRoles().split(", "))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; //Неистек = True
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; //Незаблочен = True
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; //Истек ли срок пароля = true
    }

    @Override
    public boolean isEnabled() {
        return true; // true = включен
    }
}
