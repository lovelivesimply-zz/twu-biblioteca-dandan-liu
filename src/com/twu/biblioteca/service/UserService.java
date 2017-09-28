package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.respository.UserRespository;

import java.util.Map;

public class UserService {

    public User getUserInf(String libraryNum){
        Map<String,User> userRespository=UserRespository.getUserRespository();
        User user=userRespository.get(libraryNum);
       return user;
    }
}
