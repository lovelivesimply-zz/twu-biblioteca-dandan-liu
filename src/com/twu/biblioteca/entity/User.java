package com.twu.biblioteca.entity;

public class User {
    public String libraryNumber;
    public String password;
    public User(String libraryNumber,String password){
        this.libraryNumber=libraryNumber;
        this.password=password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
