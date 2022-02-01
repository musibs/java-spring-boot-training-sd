package io.test.service;

import io.test.model.Comment;

import java.util.Optional;

public interface CommentService {

    Comment createComment(Comment comment);
    Optional<Comment> getCommentById(Long id);
    Iterable<Comment> getAllComments();
    void updateComment(Long id, Comment updatedComment);
    void deleteComment(Long id);

}
