package com.example.Task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.Task.controller.TaskController;
import com.example.Task.controller.UserController;

@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }
    
    @SuppressWarnings("unused")
    @Bean
    CommandLineRunner runner(ApplicationContext context) {
        return args -> {
            UserController userController = context.getBean(UserController.class);
            TaskController taskController = context.getBean(TaskController.class);

            // Load sample users and tasks
            userController.loadSampleUsers();
            taskController.loadSampleTasks();

            // Display users and their tasks
            userController.displayAllUsers();
            taskController.displayTasksForUser("John");
            taskController.displayTasksForUser("Alice");
        };
    }

}
