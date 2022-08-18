package com.company.lesson14;

public class Main {
    public static void main(String[] args)  {
        User user = new User("Pavel", 12);
        System.out.println(user.toString());
        User user2 = new User();
        System.out.println(user2.toString());
        System.out.println(user.equals(user2));

    }
}