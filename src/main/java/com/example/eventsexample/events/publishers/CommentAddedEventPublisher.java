package com.example.eventsexample.events.publishers;

import com.example.eventsexample.events.CommentAddedEvent;
import com.example.eventsexample.model.entities.Comment;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CommentAddedEventPublisher {

    private final ApplicationEventPublisher publisher;

    public CommentAddedEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishCommentAddedEvent(Comment comment){
        CommentAddedEvent event = new CommentAddedEvent(comment);
        publisher.publishEvent(event);
    }
}
