package com.twu.biblioteca;


import com.twu.biblioteca.com.twu.biblioteca.respository.*;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        getDefaultInfoAfterLogin();
    }

    public static void getDefaultInfoAfterLogin(){
        getWelcomeMessage();
        getMainMenu();
        getMenuDetail();
        checkoutBook();
    }
    public static void getMenuDetail(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input the index of menu:");

        while (!scanner.hasNextInt()){
            System.out.println("please input the index of menu:");
            Object inputObject=scanner.next();
        }
        int menuId=scanner.nextInt();
        while(menuId>3 || menuId<1){
            System.out.println("Select a valid option!");
            menuId=scanner.nextInt();
        }

        if(menuId==1){
            bookList();
        }
        if(menuId==2){
            movieList();
        }

    }
    public static void getWelcomeMessage(){
        System.out.println("Welcome to the Biblioteca library!");
    }
    public static void checkoutBook(){
        System.out.println("Please input the bookName you want to checkout:");
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            System.out.println("Please input the bookName you want to checkout:");
            String bookName=scanner.nextLine();
            if("Quit".equals(bookName)){
                break;
            }

            BookRespository bookRespository=new BookRespository();
            Map<String,Book> bookTotal=bookRespository.getBookRespository();
            if(bookTotal.containsKey(bookName)){
                bookTotal.remove(bookName);
                System.out.println("Thank you! Enjoy the book");
            }else{
                System.out.println("That book is not available.");
            }

        }
    }
    public static void checkoutMovie(){
        System.out.println("Please input the movieName you want to checkout:");
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            System.out.println("Please input the movieName you want to checkout:");
            String movieName=scanner.nextLine();
            if("Quit".equals(movieName)){
                break;
            }

            MovieRepository movieRespository=new MovieRepository();
            Map<String,Movie> movieTotal=movieRespository.getMovieRespository();
            if(movieTotal.containsKey(movieName)){
                movieTotal.remove(movieName);
                System.out.println("Thank you! Enjoy the Movie");
            }else{
                System.out.println("That movie is not available.");
            }

        }
    }
    public static void returnBook(){
        System.out.println("Please input the bookName you want to return:");
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            System.out.println("Please input the bookName you want to return:");
            String bookName=scanner.nextLine();
            if("Quit".equals(bookName)){
                break;
            }

            BookRespository bookRespository=new BookRespository();
            Map<String,Book> bookDB=bookRespository.getBookDB();

            if(bookDB.containsKey(bookName) ){
                System.out.println("Thank you for return the Book!");
            }else{
                System.out.println("That is not a valid book to return!");
            }
        }
    }
    public static void getMainMenu(){
        MenuRepository menuRepository=new MenuRepository();
        System.out.println("List options:");
        List<String> menuList=menuRepository.getMenuList();
        for(int i=0;i<menuList.size();i++){
            System.out.println(i+1+":"+menuList.get(i));
        }
    }
    public static void bookList(){
        BookRespository bookRespository=new BookRespository();
        Map<String,Book> bookTotal=bookRespository.getBookRespository();
        Iterator bookIterator=bookTotal.entrySet().iterator();
        while(bookIterator.hasNext()){
            Map.Entry<String,Book> mapEntry=(Map.Entry<String,Book>)bookIterator.next();
            Book book=mapEntry.getValue();
            System.out.println(": BookName:"+book.name+" BookAuthor:"+book.author+" BookPublishedTime:"+book.publishTime);
        }
    }

    public static  void movieList(){
        MovieRepository movieRepository=new MovieRepository();
        Map<String,Movie> movieTotal=movieRepository.getMovieRespository();
        Iterator movieIterator=movieTotal.entrySet().iterator();
        while(movieIterator.hasNext()){
            Map.Entry<String,Movie> mapEntry=(Map.Entry<String,Movie>)movieIterator.next();
            Movie movie=mapEntry.getValue();
            System.out.println("MovieName:"+movie.getName()+" MovieYear:"+movie.getYear()+" MovieDirector:"+movie.getDirector()+" MovieRating:" +
                    movie.getMovieRating());
        }

    }
}

