package com.example.Task.controller;


import com.example.Task.model.User;
import com.example.Task.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Load sample users
    public void loadSampleUsers() {
        userService.addUser(new User(1, "John"));
        userService.addUser(new User(2, "Alice"));
    }

    // Display all users
    public void displayAllUsers() {
        System.out.println("Users:");
        userService.getAllUsers().forEach(System.out::println);
    }
}
