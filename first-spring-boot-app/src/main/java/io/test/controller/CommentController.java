package io.test.controller;

import io.test.model.Comment;
import io.test.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

/**
 * http://localhost:8080/comments
 * http://localhost:8080/comments/1
 * http://localhost:8080/users
 *
 * GET, POST, PUT, DELETE
 *
 * PathVariable
 * RequestParameter
 */

@RestController
@RequestMapping("/comments")
public class CommentController {

    /**
     *
     *  Spring Boot - backend
     *  Some Java based frontend (JSP, Thymeleaf, Mustache,..)
     *
     *
     *  SPA - Single Page Application
     *
     *  Spring Boot - Backend (Defines APIs) , Quarkus, Micronaut
     *  Angular, React, Vue - Frontend (Actual UI)
     *
     */

    // SOLID

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/")
    public Iterable<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @GetMapping("/{id}")
    public Optional<Comment> getCommentById(@PathVariable("id") Long id) {
        return commentService.getCommentById(id);
    }

    @PostMapping("/")
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @PutMapping("/{id}")
    public void updateComment(@PathVariable("id") Long id, @Valid @RequestBody Comment comment) {
        commentService.updateComment(id, comment);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
    }

}
