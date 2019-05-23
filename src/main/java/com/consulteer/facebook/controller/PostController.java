package com.consulteer.facebook.controller;

import com.consulteer.facebook.entity.Comment;
import com.consulteer.facebook.service.CommentService;
import com.consulteer.facebook.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @Autowired
    private CommentService commentService;

    @PutMapping("/{id}/like")
    public Integer likePost(@PathVariable("id") Long id) {
        return postService.likePost(id);
    }

    @GetMapping("/{postId}/comments")
    public ResponseEntity<List<Comment>> findAllComments(@PathVariable("postId") Long postId) {
        return ResponseEntity.ok(commentService.findAllByPostId(postId));
    }
}




