package com.example.Task.service;


import com.example.Task.model.User;
import com.example.Task.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Add a user
    public void addUser(User user) {
        userRepository.addUser(user);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    // Find a user by name
    public Optional<User> findUserByName(String name) {
        return userRepository.getAllUsers().stream()
                .filter(user -> user.getName().equals(name))
                .findFirst();
    }
}

