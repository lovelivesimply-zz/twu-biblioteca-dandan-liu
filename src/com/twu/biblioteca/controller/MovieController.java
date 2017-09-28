package com.twu.biblioteca.controller;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.respository.MovieRepository;

import java.util.Map;


public class MovieController {
    public  boolean checkoutMovie(String movieName){
            MovieRepository movieRespository=new MovieRepository();
            Map<String,Movie> movieTotal=movieRespository.getMovieRespository();
            if(movieTotal.containsKey(movieName)){
                movieTotal.remove(movieName);
                return true;
            }else{
                return false;
            }

        }
}

