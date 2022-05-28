package com.example.eventsexample.controller;

import com.example.eventsexample.events.publishers.CommentAddedEventPublisher;
import com.example.eventsexample.model.entities.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {

    private final CommentAddedEventPublisher publisher;

    public CommentController(CommentAddedEventPublisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/comment-form")
    public String getCommentForm(Model model) {
        model.addAttribute("comment", new Comment());
        return "comment-form";
    }

    @PostMapping("/post-comment")
    public String postComment(Comment comment) {
        // save comment to database
        publisher.publishCommentAddedEvent(comment);
        return "redirect:/";
    }
}
