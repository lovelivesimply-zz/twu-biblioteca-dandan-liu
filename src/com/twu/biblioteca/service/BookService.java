package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Book;
import com.twu.biblioteca.respository.BookRespository;

import java.util.Iterator;
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

    public  void bookList(){
        BookRespository bookRespository=new BookRespository();
        Map<String,Book> bookTotal=bookRespository.getBookRespository();
        Iterator bookIterator=bookTotal.entrySet().iterator();
        while(bookIterator.hasNext()){
            Map.Entry<String,Book> mapEntry=(Map.Entry<String,Book>)bookIterator.next();
            Book book=mapEntry.getValue();
            System.out.println("BookName:"+book.name+" BookAuthor:"+book.author+" BookPublishedTime:"+book.publishTime);
        }
    }
    public  boolean returnBook(String bookName){
            BookRespository bookRespository=new BookRespository();
            Map<String,Book> bookDB=bookRespository.getBookDB();
            if(bookDB.containsKey(bookName) ){
                bookRespository.getBookRespository().put(bookName,bookDB.get(bookName));
                return true;
            }else{
              return  false;
            }
        }


}
