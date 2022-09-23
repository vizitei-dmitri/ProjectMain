package project;

import java.math.BigDecimal;

public class User {

    private String name;

    private String lastname;

    private int age;

    private String username;

    private String password;

    private BigDecimal money;
    ///
    private BigDecimal mail;

    public BigDecimal getMail() {
        return mail;
    }

    public void setMail(BigDecimal mail, BigDecimal money) {
        this.mail = mail;
        this.money = money;

    }



    ///
    public User(String name, String lastname, int age, String username, String password, BigDecimal money) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        if (money != null){
            this.money = money;
        }else {
            System.out.println("invalid operation");}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 200)
            this.age = age;
        else {
            System.out.println("invalid operation");
        }
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return name + " " + lastname + " " + age + " " + username + " " + password + " " + money;
    }


}