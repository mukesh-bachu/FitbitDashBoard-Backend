package com.app.FitbitDashBoard.service;

import com.app.FitbitDashBoard.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    User saveUser(User user);

    User getUserById(UUID id);

    List<User> getAllUsers();

    User updateUser(UUID id, User updatedUser);

    void deleteUser(UUID id);
}
