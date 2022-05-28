package com.example.eventsexample.events;

import com.example.eventsexample.model.entities.Post;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class PostPublishedEvent extends ApplicationEvent {
    public PostPublishedEvent(Object source) {
        super(source);
    }

    public PostPublishedEvent(Object source, Clock clock) {
        super(source, clock);
    }

    @Override
    public String toString() {
        return "A new post has been published: " + ((Post) getSource()).getTitle();
    }
}
