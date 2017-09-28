package com.twu.biblioteca;


import com.twu.biblioteca.fronted.BookFrontPage;
import com.twu.biblioteca.fronted.LoginFrontPage;
import com.twu.biblioteca.fronted.MovieFrontPage;

public class BibliotecaApp {



    public static void main(String[] args) {
        LoginFrontPage loginFrontPage=new LoginFrontPage();
        BookFrontPage bookFrontPage=new BookFrontPage();
        MovieFrontPage movieFrontPage=new MovieFrontPage();
        String userLibraryNum=loginFrontPage.login();

        loginFrontPage.getMenuDetail();


    }

    public static void getDefaultInfoAfterLogin(){
        getWelcomeMessage();


    }

    public static void getWelcomeMessage(){
        System.out.println("Welcome to the Biblioteca library!");
    }






}

