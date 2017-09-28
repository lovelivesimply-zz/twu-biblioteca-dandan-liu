package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.respository.BookRespository;

import java.util.Map;

public class BookService {
    public  boolean checkoutBook(String bookName){

            BookRespository bookRespository=new BookRespository();
            Map<String,Book> bookTotal=bookRespository.getBookRespository();
            if(bookTotal.containsKey(bookName)){
                bookTotal.remove(bookName);
                return true;
            }else{
                return false;
            }
    }
}
