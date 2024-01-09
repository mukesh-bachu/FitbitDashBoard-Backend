package com.app.FitbitDashBoard.service;

import com.app.FitbitDashBoard.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, User updatedUser);

    void deleteUser(Long id);
}
