package com.example.ChildrenCare.services;

import com.example.ChildrenCare.model.User;
import com.example.ChildrenCare.model.UserRepository;

public interface UserService {

    public User registerUser(String username, String password);

    }


