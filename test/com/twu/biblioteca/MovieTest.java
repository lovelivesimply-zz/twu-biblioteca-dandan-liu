package com.twu.biblioteca;

import com.twu.biblioteca.controller.MovieController;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MovieTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    MovieController movieController=new MovieController();

    @Test
    public void should_return_true_when_checkout_input_valid_movieName(){

        String validMovieName="firstMovie";
        assertTrue(movieController.checkoutMovie(validMovieName));
    }
    @Test
    public void should_return_false_when_checkout_input_invalid_movieName(){

        String validMovieName="invalidMovie";
        assertFalse(movieController.checkoutMovie(validMovieName));
    }
    @Test
    public void should_return_movieList() {
        log.clearLog();
        movieController.movieList();
        assertEquals(log.getLog(), (
                "MovieName:firstMovie MovieYear:2017 MovieDirector:firstDirector MovieRating:4\n"+
                        "MovieName:secondMovie MovieYear:2016 MovieDirector:secondDirector MovieRating:5\n"
        ));
    }
}
