package com.consulteer.facebook.service;

import com.consulteer.facebook.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAllByPostId(Long postId);
}

