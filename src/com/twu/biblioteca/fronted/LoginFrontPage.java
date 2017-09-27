package com.twu.biblioteca.fronted;

import com.twu.biblioteca.controller.LoginController;
import com.twu.biblioteca.entity.User;

import java.util.Scanner;

public class LoginFrontPage {


    public static void login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please login:");
        System.out.println("library Number: ");
        String libraryNum=scanner.nextLine();
        System.out.println("password: ");
        String password=scanner.nextLine();


        User user=new User(libraryNum,password);

        while(!LoginController.login(user)){
            System.out.println("Your library Number or password is error,Please input the right account");
            System.out.println("library Number: ");
            libraryNum=scanner.nextLine();
            System.out.println("password: ");
            password=scanner.nextLine();
            user.setLibraryNumber(libraryNum);
            user.setPassword(password);
        }


    }
}
