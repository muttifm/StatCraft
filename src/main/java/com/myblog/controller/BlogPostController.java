package com.myblog.controller;

import com.myblog.model.BlogPost;
import com.myblog.service.BlogPostService;

import java.util.List;

public class BlogPostController {
    private final BlogPostService blogPostService;

    public BlogPostController(BlogPostService blogPostService) {
        this.blogPostService = blogPostService;
    }

    public List<BlogPost> getAllPosts() {
        return blogPostService.getAllPosts();
    }

    public BlogPost getPostById(String id) {
        return blogPostService.getPostById(id);
    }

    public void createPost(BlogPost post) {
        blogPostService.createPost(post);
    }

    public void updatePost(BlogPost post) {
        blogPostService.updatePost(post);
    }

    public void deletePost(String id) {
        blogPostService.deletePost(id);
    }
}
