package com.consulteer.facebook.repository;

import com.consulteer.facebook.entity.Comment;
import com.consulteer.facebook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("Select * from Comment C where C.post = ?1")
    List<Comment> findAllByPost(Post post);
}
