package com.example.Task.service;

import com.example.Task.model.Task;
import com.example.Task.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Add a task
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return taskRepository.getAllTasks();
    }

    // Get tasks assigned to a specific user
    public List<Task> getTasksByUser(String username) {
        return taskRepository.getAllTasks().stream()
                .filter(task -> task.getAssignedTo().equals(username))
                .collect(Collectors.toList());
    }
}
