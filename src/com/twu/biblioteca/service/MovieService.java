package com.twu.biblioteca.service;

import com.twu.biblioteca.entity.Movie;
import com.twu.biblioteca.respository.MovieRepository;

import java.util.Iterator;
import java.util.Map;


public class MovieService {
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
    public  void movieList(){
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
    public  boolean returnMovie(String movieName){
        MovieRepository movieRepository=new MovieRepository();
        Map<String,Movie> movieDB=movieRepository.getMovieDB();
        if(movieDB.containsKey(movieName) ){
            movieRepository.getMovieRespository().put(movieName,movieDB.get(movieName));
            return true;
        }else{
            return  false;
        }
    }
}

