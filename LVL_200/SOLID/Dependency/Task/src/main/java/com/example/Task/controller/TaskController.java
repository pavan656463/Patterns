package com.example.Task.controller;

import com.example.Task.model.PersonalTask;
import com.example.Task.model.Task;
import com.example.Task.model.TeamTask;
import com.example.Task.service.TaskService;
import org.springframework.stereotype.Controller;

@Controller
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // Load sample tasks
    public void loadSampleTasks() {
        taskService.addTask(new PersonalTask(1, "Complete Budget", "Prepare budget for the month", "John"));
        taskService.addTask(new TeamTask(2, "Launch Campaign", "Launch the marketing campaign", "Alice", "Marketing"));
        taskService.addTask(new PersonalTask(3, "Submit Assignment", "Submit by tomorrow", "Alice"));
    }

    // Display all tasks for a user
    public void displayTasksForUser(String username) {
        System.out.println("Tasks for " + username + ":");
        taskService.getTasksByUser(username).forEach(Task::displayTaskDetails);
    }
}

