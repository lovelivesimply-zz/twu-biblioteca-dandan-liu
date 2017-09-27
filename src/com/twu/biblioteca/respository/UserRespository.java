package com.twu.biblioteca.respository;

import com.twu.biblioteca.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserRespository {
    Map<String,User> userRespository=new HashMap<String, User>();
    public Map<String,User> getUserRespository(){
        return  userRespository;
    }
    public UserRespository(){
        User userFirst=new User("111-1111","1111111");
        User userSecond=new User("111-2222","111222");
        userRespository.put(userFirst.getLibraryNumber(),userFirst);
        userRespository.put(userSecond.getLibraryNumber(),userSecond);
    }
}
