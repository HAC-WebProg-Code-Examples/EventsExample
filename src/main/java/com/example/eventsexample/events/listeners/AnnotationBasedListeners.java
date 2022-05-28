package com.example.eventsexample.events.listeners;

import com.example.eventsexample.events.PostPublishedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationBasedListeners {

    @EventListener
    public void handleContextRefreshed(ContextRefreshedEvent event) {
        System.out.println("Context refreshed event was handled by an annotation-based listener!");
    }

    @EventListener
    public void doThisWhenNewPostPublished(PostPublishedEvent event) {
        System.out.println("PostPublishedEvent handled by an annotation-based listener!\n" + event);
    }
}
