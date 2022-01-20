package com.example.jstask313.service;

import com.example.jstask313.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Set;

public interface UserService {
    User findUserByEmail(String email);

    void addNewUser(User user);

    Set<User> findAllUsers();

    User findUserById(long id);

    void deleteUserById(long id);

    void updateUser(User user);

}
