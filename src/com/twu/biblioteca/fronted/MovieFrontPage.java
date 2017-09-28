package com.twu.biblioteca.fronted;

import com.twu.biblioteca.controller.MovieController;


import java.util.Scanner;

public  class MovieFrontPage {
    MovieController movieController=new MovieController();
    public  void checkoutMoviePage(){

        System.out.println("Please input the movieName you want to checkout:");
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNextLine()){
            System.out.println("Please input the movieName you want to checkout:");
            String movieName=scanner.nextLine();
            if("Quit".equals(movieName)){
                break;
            }
            if(movieController.checkoutMovie(movieName)){
                System.out.println("Thank you! Enjoy the Movie");
            }else {
                System.out.println("That movie is not available.");
            }
        }
    }

    public void getMovieList(){
        movieController.movieList();
    }
    public void returnMovie(){
        System.out.println("Please input the movieName you want to return:");
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){

            String movieName=scanner.nextLine();
            if("Quit".equals(movieName)){
                break;
            }
            if(movieController.returnMovie(movieName)){
                System.out.println("Thank you for return the movie!");
            }else{
                System.out.println("That is not a valid movie to return!");
                System.out.println("Please input the movieName you want to return:");
            }
        }
    }
}
