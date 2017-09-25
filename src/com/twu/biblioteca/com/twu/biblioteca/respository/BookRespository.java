package com.twu.biblioteca.com.twu.biblioteca.respository;

import java.util.HashMap;
import java.util.Map;

public class BookRespository {
    Map<String,Book>  bookRespository=new HashMap<String, Book>();
    Map<String,Book>  bookDB=new HashMap<String, Book>();
    public BookRespository(){
        bookRespository.put("firstBook",new Book("firstBook","firstBookAuthor","2016"));
        bookRespository.put("secondBook",new Book("secondBook","secondBookAuthor","2017"));
        bookDB.put("firstBook",new Book("firstBook","firstBookAuthor","2016"));
        bookDB.put("secondBook",new Book("secondBook","secondBookAuthor","2017"));
    }
    public  Map<String,Book> getBookRespository(){
        return  bookRespository;
    }
    public  Map<String,Book> getBookDB(){
        return  bookDB;
    }
}
