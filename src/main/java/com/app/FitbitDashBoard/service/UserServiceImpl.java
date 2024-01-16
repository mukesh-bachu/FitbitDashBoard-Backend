package com.app.FitbitDashBoard.service;

import com.app.FitbitDashBoard.model.User;
import com.app.FitbitDashBoard.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(UUID id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            // updating fields that are allowed to be updated
            existingUser.setFirstName(updatedUser.getFirstName());
            existingUser.setLastName(updatedUser.getLastName());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPhone(updatedUser.getPhone());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setFitbitUrl(updatedUser.getFitbitUrl());

            // saving the updated user
            return userRepository.save(existingUser);
        }

        // returning null if the user with the given id is not found
        return null;
    }

    @Override
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }
}
