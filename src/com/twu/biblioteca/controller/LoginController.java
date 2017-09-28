package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.LoginService;


public class LoginController {

    public  boolean login(User user){
        return  LoginService.login(user);
    }
    BookController bookController=new BookController();
    MovieController movieController=new MovieController();
    public  void getMenuDetail(int menuId){

    }
}
