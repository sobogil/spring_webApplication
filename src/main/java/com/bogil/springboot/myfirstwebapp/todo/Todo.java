package com.bogil.springboot.myfirstwebapp.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import jdk.jfr.DataAmount;

import java.time.LocalDate;
@Entity
public class Todo {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    @Size(min=10, message="Enter atleast 10 characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo(long id, String username, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public Todo() {

    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
