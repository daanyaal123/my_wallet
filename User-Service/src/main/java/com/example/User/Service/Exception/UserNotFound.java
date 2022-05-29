package com.example.User.Service.Exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound(int id){
        super("User id not found : " +id);
    }   
}
