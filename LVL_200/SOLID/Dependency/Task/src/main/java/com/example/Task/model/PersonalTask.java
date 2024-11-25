package com.example.Task.model;

public class PersonalTask extends Task {

    public PersonalTask(int id, String title, String description, String assignedTo) {
        super(id, title, description, assignedTo);
    }

    @Override
    public void displayTaskDetails() {
        System.out.println("Personal Task [ID: " + getId() + "]: " + getTitle() + " - " + getDescription() +
                " (Assigned to: " + getAssignedTo() + ")");
    }
}
