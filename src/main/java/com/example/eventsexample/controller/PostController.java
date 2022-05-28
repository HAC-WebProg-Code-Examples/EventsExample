package com.example.eventsexample.controller;

import com.example.eventsexample.events.publishers.PostPublishedEventPublisher;
import com.example.eventsexample.model.entities.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {

    private final PostPublishedEventPublisher publisher;

    public PostController(PostPublishedEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/post-form")
    public String getPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post-form";
    }

    @PostMapping("/publish-post")
    public String publishPost(Post post) {
        // save post to database
        publisher.publishPostPublishedEvent(post);
        return "redirect:/";
    }
}
