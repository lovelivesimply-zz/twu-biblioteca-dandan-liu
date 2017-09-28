package com.twu.biblioteca.respository;

import com.twu.biblioteca.entity.Movie;

import java.util.HashMap;
import java.util.Map;

public class MovieRepository {
    Map<String,Movie> movieRespository=new HashMap<String, Movie>();
    Map<String,Movie>  movieDB=new HashMap<String, Movie>();
    public MovieRepository(){
        movieRespository.put("firstMovie",new Movie("firstMovie","2017","firstDirector","4"));
        movieRespository.put("secondMovie",new Movie("secondMovie","2016","secondDirector","5"));
        movieDB.put("firstMovie",new Movie("firstMovie","2017","firstDirector","4"));
        movieDB.put("secondMovie",new Movie("secondMovie","2016","secondDirector","5"));
    }
    public  Map<String,Movie> getMovieRespository(){
        return  movieRespository;
    }
    public  Map<String,Movie> getMovieDB(){
        return  movieDB;
    }
}
