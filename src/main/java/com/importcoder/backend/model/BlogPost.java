package com.importcoder.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "blogs")
public class BlogPost {
    @Id
    private String id;
    private String title;
    private String content;
    private String summary;
    private String author;
    private String createdAt;
}
