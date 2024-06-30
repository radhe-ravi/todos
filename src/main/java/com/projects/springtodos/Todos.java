package com.projects.springtodos;

import java.time.LocalDate;

// from Database
// static list of todos => database H2,MySql
public class Todos {
    private int id;
    private String username;
    private String description;
    private boolean completed;
    private LocalDate targetDate;
    public Todos(int id, String username, String description, boolean completed, LocalDate targetDate) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.completed = completed;
        this.targetDate = targetDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }
}
