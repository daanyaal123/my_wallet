package com.example.User.Service.Exception;

public class InvalidUser extends RuntimeException {
    public InvalidUser(){
        super("Invalid User, Check the attributes provided for the User");
    }
}
