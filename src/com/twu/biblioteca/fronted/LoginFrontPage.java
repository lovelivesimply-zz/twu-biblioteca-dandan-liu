package com.twu.biblioteca.fronted;

import com.twu.biblioteca.controller.LoginController;
import com.twu.biblioteca.controller.UserController;
import com.twu.biblioteca.entity.User;
import com.twu.biblioteca.respository.MenuRepository;

import java.util.List;
import java.util.Scanner;

public class LoginFrontPage {

    LoginController loginController=new LoginController();
    UserController userController=new UserController();
    String userLibraryNum;
    MovieFrontPage movieFrontPage=new MovieFrontPage();
    BookFrontPage bookFrontPage=new BookFrontPage();
    public  String login(){
        getWelcomeMessage();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please login:");
        System.out.println("library Number: ");
        String libraryNum=scanner.nextLine();
        System.out.println("password: ");
        String password=scanner.nextLine();


        User user=new User(libraryNum,password);

        while(!loginController.login(user)){
            System.out.println("Your library Number or password is error,Please input the right account");
            System.out.println("library Number: ");
            libraryNum=scanner.nextLine();
            System.out.println("password: ");
            password=scanner.nextLine();
            user.setLibraryNumber(libraryNum);
            user.setPassword(password);
        }
        userLibraryNum=libraryNum;
        getMainMenu();
        return libraryNum;

    }

    public  void getWelcomeMessage(){
        System.out.println("Welcome to the Biblioteca library!");
    }
    public  void getMainMenu(){
        MenuRepository menuRepository=new MenuRepository();
        System.out.println("List options:");
        List<String> menuList=menuRepository.getMenuList();
        for(int i=0;i<menuList.size();i++){
            System.out.println(i+1+":"+menuList.get(i));
        }
    }

    public void getuserInfo(String userLibraryNum){
        User user=userController.getUser(userLibraryNum);
        System.out.println("name: "+user.getName());
        System.out.println("emailAddress: "+user.getEmailAdress());
        System.out.println("phoneNumber: "+user.getPhoneNumb());
    }
    public void getMenuDetail() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the index of menu you want to see: ");
        while(!scanner.hasNextInt()){
            String  menuId=scanner.nextLine();

            System.out.println("Please input the valid index of menu you want to see: ");
        }
        int menuId=scanner.nextInt();
        if(menuId<1 && menuId >4){
            switch (menuId){
                case 1: bookFrontPage.getBookList();
                case 2: movieFrontPage.getMovieList();
                case 3:getuserInfo(userLibraryNum);
            }

        }
    }
}
