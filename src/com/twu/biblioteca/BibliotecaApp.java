package com.twu.biblioteca;


import com.twu.biblioteca.com.twu.biblioteca.respository.Book;
import com.twu.biblioteca.com.twu.biblioteca.respository.BookRespository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BibliotecaApp {



    public static void main(String[] args) {
        getWelcomeMessage();
    }

    public static void getDefaultInfoAfterLogin(){
        getWelcomeMessage();

        getBookLists();

    }
    public static void getWelcomeMessage(){
        System.out.println("Welcome to the Biblioteca library!");
    }
    public static void getBookLists(){
        BookRespository bookRespository=new BookRespository();
        Map<String,Book> bookTotal=bookRespository.getBookRespository();

        for(int i=0;i<bookTotal.size();i++){
            Book book=bookTotal.get(i+1+"");
            System.out.println(i+1+": BookName:"+book.name+" BookAuthor:"+book.author+" BookPublishedTime:"+book.publishTime);
        }
    }
}
