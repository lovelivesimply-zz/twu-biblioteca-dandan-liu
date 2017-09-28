package com.twu.biblioteca.respository;

import java.util.ArrayList;
import java.util.List;

public class MenuRepository {
    public  MenuRepository(){
        menuRepository.add("BookList");
        menuRepository.add("MovieList");
        menuRepository.add("userInfo");
    }
    List<String> menuRepository=new ArrayList<String>();

    public List<String> getMenuList(){
        return menuRepository;
    }


}
