package com.example.User.Service.Exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(UserNotFound.class)
    public void springHandleNotFound(HttpServletResponse response) throws IOException{
        response.sendError(HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler
    public void springHandleInvalid(HttpServletResponse response) throws IOException{
        response.sendError(HttpStatus.NOT_ACCEPTABLE.value());
    }
}
