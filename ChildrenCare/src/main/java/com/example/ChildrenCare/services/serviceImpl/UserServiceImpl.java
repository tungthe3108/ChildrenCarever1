package com.example.ChildrenCare.services.serviceImpl;

import com.example.ChildrenCare.model.User;
import com.example.ChildrenCare.model.UserRepository;
import com.example.ChildrenCare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public User registerUser(String username, String password) {
        User user = userRepository.findByUserName(username);
        if (user != null) {
            throw new RuntimeException("Username already exists");
        }
        user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
