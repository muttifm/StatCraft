package com.myblog.dao;

import com.myblog.model.BlogPost;
import java.util.List;

public interface BlogPostDao {
    List<BlogPost> getAllPosts();
    BlogPost getPostById(String id);  // <-- updated parameter type
    void createPost(BlogPost post);
    void updatePost(BlogPost post);
    void deletePost(String id);  // <-- updated parameter type
}
