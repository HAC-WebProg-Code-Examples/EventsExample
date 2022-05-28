package com.example.eventsexample.events.listeners;

import com.example.eventsexample.events.CommentAddedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.PayloadApplicationEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * Handler for a custom event - we define and publish every {@link CommentAddedEvent} in our code.
 */
@Component
public class CommentAddedListener implements ApplicationListener<PayloadApplicationEvent<CommentAddedEvent>> {
    @Override
    public void onApplicationEvent(PayloadApplicationEvent<CommentAddedEvent> event) {
        System.out.println("Yay! a new comment!");
        System.out.println("Let's see what's in the event: " + event.getPayload());
    }
}
