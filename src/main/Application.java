package com.myblog;

import com.myblog.controller.BlogPostController;
import com.myblog.dao.BlogPostDaoImpl;
import com.myblog.dao.UserDaoImpl;
import com.myblog.service.BlogPostServiceImpl;
import com.myblog.service.UserServiceImpl;

public class Application {
    public static void main(String[] args) {
        // Instantiate DAOs
        UserDaoImpl userDao = new UserDaoImpl();
        BlogPostDaoImpl blogPostDao = new BlogPostDaoImpl();

        // Instantiate Services
        UserServiceImpl userService = new UserServiceImpl(userDao);
        BlogPostServiceImpl blogPostService = new BlogPostServiceImpl(blogPostDao);

        // Instantiate Controllers
        BlogPostController blogPostController = new BlogPostController(blogPostService);
        // UserController userController = new UserController(userService);

        // TODO: Run your application
    }
}
