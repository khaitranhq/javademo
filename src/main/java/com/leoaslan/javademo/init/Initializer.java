package com.leoaslan.javademo.init;

import com.leoaslan.javademo.model.Post;
import com.leoaslan.javademo.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {

    private final PostRepository postRepository;

    public Initializer(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void run(String... strings) {
        Stream.of("Post 1", "Post 2", "Post 3", "Post 4", "Post 5")
                .forEach(content -> postRepository.save(new Post(content)));
        postRepository.findAll().forEach(System.out::println);
    }
}
