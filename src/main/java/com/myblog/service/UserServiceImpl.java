package com.myblog.service;

import com.myblog.dao.UserDao;
import com.myblog.model.User;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public void registerUser(User user) {
        userDao.registerUser(user);
    }
}
