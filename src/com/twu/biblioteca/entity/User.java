package com.twu.biblioteca.entity;

public class User {
    public String libraryNumber;
    public String password;
    public String emailAdress;
    public String phoneNumb;
    public String name;
    public User(String name,String libraryNumber,String password,String emailAdress,String phoneNumb){
        this.name=name;
        this.libraryNumber=libraryNumber;
        this.password=password;
        this.emailAdress=emailAdress;
        this.phoneNumb=phoneNumb;
        this.phoneNumb=phoneNumb;
    }
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

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getName() {
        return name;
    }
}
