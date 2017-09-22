package com.twu.biblioteca.com.twu.biblioteca.respository;

import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    public  MenuRepository(){
        menuRepository.add("BookList");
    }
    List<String> menuRepository=new ArrayList<String>();

    public List<String> getMenuList(){
        return menuRepository;
    }


}
