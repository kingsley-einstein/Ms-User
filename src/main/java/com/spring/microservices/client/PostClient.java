package com.spring.microservices.client;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "post-service")
public interface PostClient {
    @GetMapping("/api/v1/post/byauthor/{author}")
    public List<Post> getByAuthor(@PathVariable("author") UUID author);
}