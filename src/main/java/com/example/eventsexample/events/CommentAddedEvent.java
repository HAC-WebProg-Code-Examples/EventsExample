package com.example.eventsexample.events;

import com.example.eventsexample.model.entities.Comment;

public class CommentAddedEvent {

    private final Comment comment;

    public CommentAddedEvent(Comment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "A new comment was added to an existing post: " + comment.getText();
    }
}
