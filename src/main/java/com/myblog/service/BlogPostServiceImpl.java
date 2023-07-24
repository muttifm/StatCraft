package com.myblog.service;

import com.myblog.dao.BlogPostDao;
import com.myblog.model.BlogPost;

import java.util.List;

public class BlogPostServiceImpl implements BlogPostService {
    private final BlogPostDao blogPostDao;

    public BlogPostServiceImpl(BlogPostDao blogPostDao) {
        this.blogPostDao = blogPostDao;
    }

    @Override
    public List<BlogPost> getAllPosts() {
        return blogPostDao.getAllPosts();
    }

    @Override
    public BlogPost getPostById(String id) {  // <-- updated parameter type
        return blogPostDao.getPostById(id);
    }

    @Override
    public void createPost(BlogPost post) {
        blogPostDao.createPost(post);
    }

    @Override
    public void updatePost(BlogPost post) {
        blogPostDao.updatePost(post);
    }

    @Override
    public void deletePost(String id) {  // <-- updated parameter type
        blogPostDao.deletePost(id);
    }
}
