package com.twu.biblioteca.fronted;

import com.twu.biblioteca.controller.MovieController;


import java.util.Scanner;

public  class MovieFrontPage {

    public static void checkoutMoviePage(){
        MovieController movieController=new MovieController();
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
}
