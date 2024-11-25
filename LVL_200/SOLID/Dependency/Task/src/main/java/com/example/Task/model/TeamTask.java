package com.example.Task.model;

public class TeamTask extends Task {
    private String teamName;

    public TeamTask(int id, String title, String description, String assignedTo, String teamName) {
        super(id, title, description, assignedTo);
        this.teamName = teamName;
    }

    // Getters and Setters for teamName
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void displayTaskDetails() {
        System.out.println("Team Task [ID: " + getId() + "]: " + getTitle() + " - " + getDescription() +
                " (Assigned to: " + getAssignedTo() + ", Team: " + teamName + ")");
    }
}
