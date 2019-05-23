package com.consulteer.facebook.service;

import com.consulteer.facebook.entity.Comment;
import com.consulteer.facebook.entity.Post;
import com.consulteer.facebook.repository.CommentRepository;
import com.consulteer.facebook.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Comment> findAllByPostId(Long postId) {
        Post post = postRepository.getOne(postId);
        if (post != null) {
            return commentRepository.findAllByPost(post);
        }
        return null;
    }
}
