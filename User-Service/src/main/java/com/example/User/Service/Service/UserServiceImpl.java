package com.example.User.Service.Service;

import java.util.List;

import com.example.User.Service.Entity.User;
import com.example.User.Service.Exception.InvalidUser;
import com.example.User.Service.Exception.UserNotFound;
import com.example.User.Service.Repository.UserRepository;
import com.example.User.Service.UserValidator.UserValidator;

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
        if(UserValidator.validateUser(theUser)){
            return userRepository.save(theUser);
        }
        else throw new InvalidUser();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFound(id));
    }
    
}
