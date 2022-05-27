package com.example.User.Service.Service;

import java.util.List;

import com.example.User.Service.Entity.User;
import com.example.User.Service.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User theUser) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User findById(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
