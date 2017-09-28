package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.UserService;

public class UserController {
    UserService userService=new UserService();

    public User getUser(String libraryNum){
        return userService.getUserInf(libraryNum);
    }
}
