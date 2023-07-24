package com.myblog.controller;

import com.myblog.model.User;
import com.myblog.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void login(String username, String password) {
        User user = userService.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }

    public void register(String username, String password) {
        userService.registerUser(new User(username, password));
        System.out.println("Registration successful");
    }
}
