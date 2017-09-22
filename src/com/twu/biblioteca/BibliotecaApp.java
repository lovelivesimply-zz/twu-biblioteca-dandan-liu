package com.twu.biblioteca;


import com.twu.biblioteca.com.twu.biblioteca.respository.Book;
import com.twu.biblioteca.com.twu.biblioteca.respository.BookRespository;
import com.twu.biblioteca.com.twu.biblioteca.respository.MenuRepository;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        getDefaultInfoAfterLogin();
    }

    public static void getDefaultInfoAfterLogin(){
        getWelcomeMessage();
        getMainMenu();
        getMenuDetail();
        checkoutBook();
    }
    public static void getMenuDetail(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the index of menu:");

        while (!scanner.hasNextInt()){
            System.out.println("please input the index of menu:");
        }

        int menuId=scanner.nextInt();
        while(menuId!=1){
            System.out.println("Select a valid option!");
            menuId=scanner.nextInt();
        }

        if(menuId==1){
            bookList();
        }
    }
    public static void getWelcomeMessage(){
        System.out.println("Welcome to the Biblioteca library!");
    }
    public static void checkoutBook(){
        System.out.println("Please input the bookName you want to checkout:");
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String bookName=scanner.nextLine();
            if("Quit".equals(bookName)){
                break;
            }
            
        }
    }
    public static void getMainMenu(){
        MenuRepository menuRepository=new MenuRepository();
        System.out.println("List options:");
        List<String> menuList=menuRepository.getMenuList();
        for(int i=0;i<menuList.size();i++){
            System.out.println(i+1+":"+menuList.get(i));
        }
    }
    public static void bookList(){
        BookRespository bookRespository=new BookRespository();
        Map<String,Book> bookTotal=bookRespository.getBookRespository();

        for(int i=0;i<bookTotal.size();i++){
            Book book=bookTotal.get(i+1+"");
            System.out.println(i+1+": BookName:"+book.name+" BookAuthor:"+book.author+" BookPublishedTime:"+book.publishTime);
        }
    }
}

