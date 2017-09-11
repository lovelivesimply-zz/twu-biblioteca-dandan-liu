package com.twu.biblioteca.com.twu.biblioteca.respository;

public class Book {
    public String name;
    public String author;
    public String publishTime;

    public Book(String name,String author,String publishTime){
        this.name=name;
        this.author=author;
        this.publishTime=publishTime;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
}
