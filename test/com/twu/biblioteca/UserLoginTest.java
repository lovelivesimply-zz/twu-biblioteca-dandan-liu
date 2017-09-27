package com.twu.biblioteca;

import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.service.LoginService;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class UserLoginTest {

    LoginService loginService=new LoginService();
    @Test
    public void should_return_true_when_given_valid_user(){
        User user=new User("111-1111","1","emailAdressFirst","123456");
        assertTrue(loginService.login(user));
    }
}
