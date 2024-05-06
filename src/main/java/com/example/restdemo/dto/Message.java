package com.example.restdemo.dto;

import java.time.LocalTime;

public class Message {
    private int id;
    private String title;
    private String text;
    private LocalTime time;

    public Message() {
    }

    public Message(int id, String title, String text, LocalTime time) {
        this.id = id;
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
