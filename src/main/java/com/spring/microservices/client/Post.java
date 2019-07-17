package com.spring.microservices.client;

import java.util.UUID;

@SuppressWarnings("serial")
public class Post implements java.io.Serializable {
    private String title;
    private String content;
    private UUID author;

    public Post() {}

    public Post(String title, String content, UUID author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public UUID getAuthor() {
        return author;
    }
}