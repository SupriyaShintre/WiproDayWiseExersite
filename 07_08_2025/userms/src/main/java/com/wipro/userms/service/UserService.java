package com.wipro.userms.service;

import com.wipro.userms.entity.User;
import com.wipro.userms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NotificationClient notificationClient;

    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        notificationClient.notifyUser(savedUser, "Created");
        return savedUser;
    }

    public User updateUser(Long id, User newData) {
        User existing = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existing.setUsername(newData.getUsername());
        existing.setPassword(newData.getPassword());
        existing.setAddress(newData.getAddress());

        User updatedUser = userRepository.save(existing);
        notificationClient.notifyUser(updatedUser, "Updated");
        return updatedUser;
    }

    public void deleteUser(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
        notificationClient.notifyUser(user, "Deleted");
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}
