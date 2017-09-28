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
    public void should_return_main_menu(){
        log.clearLog();

        assertEquals(log.getLog(),("List options:\n"+"BookList\n"));
    }

}
