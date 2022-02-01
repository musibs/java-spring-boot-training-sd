package io.test.service;

import io.test.model.Comment;
import io.test.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    // Dependency Injection

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Iterable<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public void updateComment(Long id, Comment updatedComment) {
        Optional<Comment> optionalComment = commentRepository.findById(id);
        if(!optionalComment.isPresent()) {
            throw new RuntimeException("No comment with the supplied comment id exists");
        }
        updatedComment.setId(id);
        commentRepository.save(updatedComment);
    }

    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
