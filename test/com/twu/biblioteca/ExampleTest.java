package com.twu.biblioteca;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static com.twu.biblioteca.BibliotecaApp.*;
import static org.junit.Assert.assertEquals;
public class ExampleTest {


    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void should_return_welcomeMessage_when_login() {
        log.clearLog();
        getWelcomeMessage();
        assertEquals(log.getLog(), ("Welcome to the Biblioteca library!\n"));
    }
    @Test
    public void should_return_bookList_after_get_welcomeMessage() {
        log.clearLog();
        bookList();
        assertEquals(log.getLog(), ("1: BookName:firstBook BookAuthor:firstBookAuthor BookPublishedTime:2016\n" +
                "2: BookName:secondBook BookAuthor:secondBookAuthor BookPublishedTime:2017\n"));
    }

    @Test
    public void should_return_main_menu(){
        log.clearLog();
        getMainMenu();
        assertEquals(log.getLog(),("List options:\n"+"BookList\n"));

    }
}
