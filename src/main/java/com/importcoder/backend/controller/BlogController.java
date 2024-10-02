package com.importcoder.backend.controller;

import com.importcoder.backend.model.BlogPost;
import com.importcoder.backend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public List<BlogPost> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogPost> getBlogById(@PathVariable String id) {
        BlogPost blog = blogService.getBlogById(id);
        if (blog != null) {
            return ResponseEntity.ok(blog);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public BlogPost createBlog(@RequestBody BlogPost blogPost) {
        return blogService.createBlog(blogPost);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable String id) {
        blogService.deleteBlog(id);
        return ResponseEntity.noContent().build();
    }
}
