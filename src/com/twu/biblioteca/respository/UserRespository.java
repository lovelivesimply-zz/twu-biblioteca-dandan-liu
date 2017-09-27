package com.twu.biblioteca.respository;

import com.twu.biblioteca.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserRespository {
    static Map<String,User> userRespository=new HashMap<String, User>();
    public static Map<String,User> getUserRespository(){
        return  userRespository;
    }

    static {
        User userFirst=new User("111-1111","1");
        User userSecond=new User("111-2222","2");
        userRespository.put(userFirst.getLibraryNumber(),userFirst);
        userRespository.put(userSecond.getLibraryNumber(),userSecond);
    }

}
