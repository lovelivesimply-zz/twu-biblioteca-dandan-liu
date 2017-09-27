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
        User userFirst=new User("userFirst","111-1111","1","emailAddressFirst","123456");
        User userSecond=new User("userSecond","111-2222","2","emailAddressSecond","123456");
        userRespository.put(userFirst.getLibraryNumber(),userFirst);
        userRespository.put(userSecond.getLibraryNumber(),userSecond);
    }

}
