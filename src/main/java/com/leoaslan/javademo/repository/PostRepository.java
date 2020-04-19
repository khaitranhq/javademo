package com.leoaslan.javademo.repository;

import com.leoaslan.javademo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
