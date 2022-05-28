package com.example.eventsexample.events.publishers;

import com.example.eventsexample.events.PostPublishedEvent;
import com.example.eventsexample.model.entities.Post;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class PostPublishedEventPublisher {

    private final ApplicationEventPublisher publisher;

    public PostPublishedEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishPostPublishedEvent(Post post) {
        PostPublishedEvent event = new PostPublishedEvent(post);
        publisher.publishEvent(event);
    }
}
