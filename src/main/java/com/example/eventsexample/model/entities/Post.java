package com.example.eventsexample.model.entities;

//@Entity
public class Post {
    private String title;
    private String content;

    public Post() {
    }

    public Post(String title, String contents) {
        this.title = title;
        this.content = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
