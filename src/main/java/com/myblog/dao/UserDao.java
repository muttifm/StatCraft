package com.myblog.dao;

import com.myblog.model.User;
import java.util.List;
import java.util.Optional;

public interface UserDao {
    List<User> getAllUsers();
    Optional<User> getUserById(int id);
    User getUserByUsername(String username);
    void updateUser(User user);
    void deleteUser(User user);
    void registerUser(User user);
}
