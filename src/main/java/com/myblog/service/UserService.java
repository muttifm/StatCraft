package com.myblog.service;

import com.myblog.model.User;

public interface UserService {
    User getUserByUsername(String username);
    void registerUser(User user);
}
