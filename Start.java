package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static project.Menu.*;

public class Start {

    public static final List<User> userList = new ArrayList<>();

    public static void main(String[] args) {

        boolean value = true;
        do {
            Menu menu = new Menu();
            menu.createMenu();
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            MenuOption item = menu.convert(option);
            switch (item) {
                case REGISTER -> {
                    reg();
                }





                case LOGIN -> {
                    if (value == false){
                        System.out.println("Login");
                        System.out.println("enter your username and password");
                        String username = scanner.nextLine();
                        String password = scanner.nextLine();

                        try {
                            DoesUserExist(username, password);//check the account::route MenuOption
                            System.out.println("you have been logged in successfully");
                            boolean flag = true;

                        }
                        catch (Exception ex){
                            System.out.println(ex.getMessage());
                        }
                    } else {
                        System.out.println("please logout first");
                    }

                }
                case SHOW -> {
                    System.out.println(userList.toString());
                }




                case ADD -> {
                    System.out.println("Add user");
                    if (flag) {
                        reg();
                    }
                    else{
                        System.out.println("please log in first");
                    }
                }






                case ERROR -> {
                    System.out.println("Incorrect option, try again");
                }
                case QUIT -> {
                    System.out.println("Exit");
                    value = false;
                    System.out.println(userList);
                }
            }
        } while (value);

    }
}