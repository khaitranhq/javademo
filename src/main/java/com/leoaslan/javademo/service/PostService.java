package com.leoaslan.javademo.service;

import com.leoaslan.javademo.model.Post;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PostService {
    List<Post> listPost();

    ResponseEntity<?> findById(Long postId);

    Post savePost(Post post);

    void deletePost(Long postId);
}

