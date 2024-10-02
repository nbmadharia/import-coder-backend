package com.importcoder.backend.service;

import com.importcoder.backend.model.BlogPost;
import com.importcoder.backend.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public List<BlogPost> getAllBlogs() {
        return blogRepository.findAll();
    }

    public BlogPost getBlogById(String id) {
        return blogRepository.findById(id).orElse(null);
    }

    public BlogPost createBlog(BlogPost blogPost) {
        return blogRepository.save(blogPost);
    }

    public void deleteBlog(String id) {
        blogRepository.deleteById(id);
    }
}
