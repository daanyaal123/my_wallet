package com.example.User.Service.Controller;

import com.example.User.Service.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.example.User.Service.Entity.User;

@RestController
public class UserController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    List<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping("/users")
    User addUser (@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users/{id}")
    Optional<User> findById (@PathVariable int id){
        return userRepository.findById(id);
    }
}
