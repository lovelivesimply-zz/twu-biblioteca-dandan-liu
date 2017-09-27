package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.respository.UserRespository;


import java.util.Map;

public class LoginService {


    public static boolean login(User user){

        Map<String,User> userRepository= UserRespository.getUserRespository();
        if(userRepository.containsKey(user.getLibraryNumber())){
            User userDB=userRepository.get(user.getLibraryNumber());
            if(userDB.getPassword().equals(user.getPassword())){
                return true;
            }
        }
        return  false;
    }

}
