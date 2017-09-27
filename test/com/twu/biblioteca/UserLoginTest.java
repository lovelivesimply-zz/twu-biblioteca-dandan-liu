package com.twu.biblioteca;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.LoginService;
import com.twu.biblioteca.service.UserService;
import org.junit.Rule;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class UserLoginTest {

    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    LoginService loginService=new LoginService();
    UserService userService=new UserService();

    @Test
    public void should_return_true_when_given_valid_user(){
        User user=new User("userFirst","111-1111","1","emailAddressFirst","123456");
        assertTrue(loginService.login(user));
    }
    @Test
    public void should_return_false_when_given_invalid_user(){
        User user=new User("userInvalid","111-1111","invalid","emailAdressFirst","123456");
        assertFalse(loginService.login(user));
    }
    @Test
    public void should_print_userInfo_when_get_userInfo(){
        String libraryNum="111-1111";
        log.clearLog();
        userService.getUserInf(libraryNum);
        assertEquals(log.getLog(),"name: userFirst\n"+
        "emailAddress: emailAddressFirst\n"+
        "phoneNumber: 123456\n");

    }

}
