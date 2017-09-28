package com.twu.biblioteca.controller;

import com.twu.biblioteca.service.MovieService;


public class MovieController {
    MovieService movieService=new MovieService();
    public  boolean checkoutMovie(String movieName){

            if(movieService.checkoutMovie(movieName)){
                return true;
            }else{
                return false;
            }

        }
    public  void movieList(){
            movieService.movieList();
    }
    public  boolean returnMovie(String movieName){
        return  movieService.returnMovie(movieName);
    }
}

