package com.twu.biblioteca;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static com.twu.biblioteca.BibliotecaApp.GetWelcomeMessage;
import static org.junit.Assert.assertEquals;
public class ExampleTest {


    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void test() {
        log.clearLog();
        GetWelcomeMessage();
        assertEquals(log.getLog(), ("Welcome to the Biblioteca library!\n"));
    }
}
