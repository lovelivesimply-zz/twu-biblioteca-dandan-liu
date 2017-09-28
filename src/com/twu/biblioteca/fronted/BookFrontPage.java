package com.twu.biblioteca.fronted;

import com.twu.biblioteca.controller.BookController;

import java.util.Scanner;

public class BookFrontPage {
    BookController bookController=new BookController();
    public  void checkoutBook(){
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

    public void getBookList(){
        bookController.getBookList();
    }
    public  void returnBook(){
        System.out.println("Please input the bookName you want to return:");
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){

            String bookName=scanner.nextLine();
            if("Quit".equals(bookName)){
                break;
            }
            if(bookController.returnBook(bookName)){
                System.out.println("Thank you for return the Book!");
            }else{
                System.out.println("That is not a valid book to return!");
                System.out.println("Please input the bookName you want to return:");
            }
        }
    }
}
