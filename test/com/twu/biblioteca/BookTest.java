package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    BookController bookController=new BookController();
    @Test
    public void should_retrun_true_when_checkout_book_input_valid_bookName(){

        String validBookName="firstBook";
        assertTrue(bookController.checkoutBook(validBookName));
    }
    @Test
    public void should_retrun_false_when_checkout_book_input_invalid_bookName(){
        String invalidBookName="invalidBook";
        assertFalse(bookController.checkoutBook(invalidBookName));
    }
    @Test
    public void should_return_bookList_after_get_welcomeMessage() {
        log.clearLog();
        bookController.getBookList();
        assertEquals(log.getLog(), (
                "BookName:secondBook BookAuthor:secondBookAuthor BookPublishedTime:2017\n")+
                "BookName:firstBook BookAuthor:firstBookAuthor BookPublishedTime:2016\n");
    }
    @Test
    public void should_retrun_true_when_return_book_input_valid_bookName(){

        String validBookName="firstBook";
        assertTrue(bookController.returnBook(validBookName));
    }
    @Test
    public void should_retrun_false_when_return_book_input_invalid_bookName(){
        String invalidBookName="invalidBook";
        assertFalse(bookController.returnBook(invalidBookName));
    }
}
