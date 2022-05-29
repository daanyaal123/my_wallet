package com.example.User.Service.RestController;

import com.example.User.Service.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.User.Service.Entity.User;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<User> findAll(){
        return userService.findAll();
        //return userRepository.findAll();
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    User addUser (@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    @GetMapping("/users/{id}")
    User findById (@PathVariable int id){
        return userService.findById(id);
    }
}
