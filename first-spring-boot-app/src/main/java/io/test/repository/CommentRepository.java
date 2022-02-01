package io.test.repository;

import io.test.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {

    Iterable<Comment> findByAuthor(String author);

    /**
     *
     *  Repository
     *  CrudRepository
     *  PagingAndSortingRepository
     *
     *  JpaRepository
     *  MongoRepos
     *
     */
}
