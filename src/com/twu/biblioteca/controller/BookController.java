package com.twu.biblioteca.controller;

import com.twu.biblioteca.service.BookService;

public class BookController {
    BookService bookService=new BookService();
    public boolean checkoutBook(String bookName){
        return bookService.checkoutBook(bookName);
    }
    public void getBookList(){
        bookService.bookList();;
    }
    public  boolean returnBook(String bookName){
       return bookService.returnBook(bookName);
    }
}
