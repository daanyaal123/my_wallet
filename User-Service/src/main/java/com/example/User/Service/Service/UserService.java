package com.example.User.Service.Service;

import java.util.List;

import com.example.User.Service.Entity.User;

// Service interface to interact with repository.
public interface UserService {
    
    List<User> findAll();

    User addUser(User theUser);

    User findById(int id);
}
