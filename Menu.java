package project;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static project.Start.userList;

public class Menu {
    public static boolean flag;




    public void createMenu() {
        System.out.println("1.Register user");
        System.out.println("2.Login");
        System.out.println("3.Add user");
        System.out.println("4.Show all users");
        System.out.println("5.Quit");
    }
    //reg
    public static void reg(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Register:");
        System.out.println("enter your name and lastname");
        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        System.out.println("enter your age");
        int age  = scanner.nextInt();
        System.out.println("enter your username and password");
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        if (userList.size() != 0)   { // && IsUsernameOccupied(List<User> userList, String username) == true)
            System.out.println("enter your money");
            BigDecimal money = scanner.nextBigDecimal();

            User user = new User(name, lastname, age, username, password, money);
            System.out.println(user.toString()); //toString from User route
            userList.add(user);
        }else if (userList.size() != 0) { // && IsUsernameOccupied(List<User> userList, String username) == false)
            System.out.println("the username is occupied");
        } else {
            System.out.println("enter your money");
            BigDecimal money = scanner.nextBigDecimal();

            User user = new User(name, lastname, age, username, password, money);
            System.out.println(user.toString()); //toString from User route
            userList.add(user);
        }
    }

    public static boolean IsUsernameOccupied(List<User> userList, String username) {
//        return userList.stream().filter(user -> user.equals(user.getUsername())).findFirst().orElse(null);
        if (userList.contains(username)){
            return true;
        }
        else{
            return false;
        }

    }

    //log
    public static User DoesUserExist(String username, String password) throws Exception{
        if (userList.size() != 0){
            return (User) userList.stream().filter(user -> user.getUsername().equals(username) && user.getPassword().equals(password));
//            return (boolean) flag = true;
        }else {
            throw new Exception("the user doesn't exist");
//            return (boolean) flag = false;
        }


    };

    //convert
    public static void convert(String username, BigDecimal money, List<User> user){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter your name and lastname");
//        BigDecimal mail = scan.nextBigDecimal();
//        if (BigDecimal mail <=BigDecimal money && userList.stream().filter(user -> user.getUsername().equals(username))){
//            user.set(money, mail);
//        }

    }


    public MenuOption convert(Integer integer) {
        return Arrays.stream(MenuOption.values())
                .filter(m -> Objects.equals(m.getValue(), integer))
                .findFirst().orElse(MenuOption.ERROR);
    }


}
