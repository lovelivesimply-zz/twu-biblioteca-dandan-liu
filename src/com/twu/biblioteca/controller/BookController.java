package com.twu.biblioteca.controller;

import com.twu.biblioteca.service.BookService;

public class BookController {
    public boolean checkoutBook(String bookName){
        BookService bookService=new BookService();
        return bookService.checkoutBook(bookName);
    }
}
