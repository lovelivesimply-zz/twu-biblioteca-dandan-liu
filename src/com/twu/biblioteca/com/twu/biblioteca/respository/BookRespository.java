package com.twu.biblioteca.com.twu.biblioteca.respository;

import java.util.HashMap;
import java.util.Map;

public class BookRespository {
    Map<String,Book>  bookRespository=new HashMap<String, Book>();

    public BookRespository(){
        bookRespository.put("1",new Book("firstBook","firstBookAuthor","2016"));
        bookRespository.put("2",new Book("secondBook","secondBookAuthor","2017"));
    }
    public  Map<String,Book> getBookRespository(){
        return  bookRespository;
    }
}
