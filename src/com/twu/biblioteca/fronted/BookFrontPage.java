package com.twu.biblioteca.fronted;

import com.twu.biblioteca.controller.BookController;

import java.util.Scanner;

public class BookFrontPage {

    public  void checkoutBook(){
        BookController bookController=new BookController();

        System.out.println("Please input the bookName you want to checkout:");
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            String bookName=scanner.nextLine();
            if("Quit".equals(bookName)){
                break;
            }
            if(bookController.checkoutBook(bookName)){
                System.out.println("Thank you! Enjoy the book");
            }else{
                System.out.println("That book is not available.");
                System.out.println("Please input the bookName you want to checkout:");
            }

        }
    }
}
