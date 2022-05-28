package com.example.eventsexample.events.listeners;

import com.example.eventsexample.events.PostPublishedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Handler for a custom event - we define and publish every {@link PostPublishedEvent} in our code.
 */
@Component
public class PostPublishedListener implements ApplicationListener<PostPublishedEvent> {
    @Override
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("Yay! a new post was published!");
        System.out.println("Let's see what's in the event: " + event);
    }
}
