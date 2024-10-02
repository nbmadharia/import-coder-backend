package com.importcoder.backend.repository;

import com.importcoder.backend.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends MongoRepository<BlogPost, String> {
}
