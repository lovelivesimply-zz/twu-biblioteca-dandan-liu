package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBookTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();


    @Test
    public void should_retrun_true_when_input_valid_bookName(){
        BookController bookController=new BookController();
        String validBookName="firstBook";
        assertTrue(bookController.checkoutBook(validBookName));
    }
    @Test
    public void should_retrun_false_when_input_valid_bookName(){
        BookController bookController=new BookController();
        String invalidBookName="invalidBook";
        assertFalse(bookController.checkoutBook(invalidBookName));
    }
}
