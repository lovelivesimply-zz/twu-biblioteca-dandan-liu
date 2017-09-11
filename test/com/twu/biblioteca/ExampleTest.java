package com.twu.biblioteca;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static com.twu.biblioteca.BibliotecaApp.getBookLists;
import static com.twu.biblioteca.BibliotecaApp.getWelcomeMessage;
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
    public void ß() {
        log.clearLog();
        getBookLists();
        assertEquals(log.getLog(), ("1:thinking in java\n2:head first java\n"));
    }
}
