package com.example.restdemo.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalTime;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String text;
    private LocalTime time;

    public Message() {
    }

    public Message(String title, String text, LocalTime time) {
        this.title = title;
        this.text = text;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
