package com.twu.biblioteca;


import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {



    public static void main(String[] args) {
        getWelcomeMessage();
    }

    public static void getWelcomeMessage(){
        System.out.println("Welcome to the Biblioteca library!");
    }
    public static void getBookLists(){
        List<String> bookList=new ArrayList<String>();
        bookList.add("thinking in java");
        bookList.add("head first java");
        for(int i=0;i<bookList.size();i++){
            System.out.print(i+1+":");
            System.out.println(bookList.get(i));
        }
    }
}
