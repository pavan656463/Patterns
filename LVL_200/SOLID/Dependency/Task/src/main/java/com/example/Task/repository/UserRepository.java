package com.example.Task.repository;

import org.springframework.stereotype.Repository;
import com.example.Task.model.User;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
