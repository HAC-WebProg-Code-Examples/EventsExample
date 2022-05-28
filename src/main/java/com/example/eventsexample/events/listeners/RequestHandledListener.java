package com.example.eventsexample.events.listeners;

import com.example.eventsexample.events.PostPublishedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * Handler for a system event - the {@link RequestHandledEvent} is part of Spring, we do not define it.
 */
@Component
public class RequestHandledListener implements ApplicationListener<RequestHandledEvent> {
    @Override
    public void onApplicationEvent(RequestHandledEvent event) {
        System.out.println("A request was just handled.");
    }
}
