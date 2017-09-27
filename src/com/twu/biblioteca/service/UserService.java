package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.respository.UserRespository;

import java.util.Map;

public class UserService {

    public void getUserInf(String libraryNum){
        Map<String,User> userRespository=UserRespository.getUserRespository();
        User user=userRespository.get(libraryNum);
        System.out.println("name: "+user.getName());
        System.out.println("emailAddress: "+user.getEmailAdress());
        System.out.println("phoneNumber: "+user.getPhoneNumb());
    }
}
