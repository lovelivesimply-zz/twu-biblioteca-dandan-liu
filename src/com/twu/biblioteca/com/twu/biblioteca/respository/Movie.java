package com.twu.biblioteca.com.twu.biblioteca.respository;

public class Movie {
    public String name;
    public String year;
    public String director;
    public String movieRating;

    public Movie(String name,String year,String director,String movieRating){
        this.name=name;
        this.year=year;
        this.director=director;
        this.movieRating=movieRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }
}
