package com.company.lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User(18, "Pavel", "MP3336888");
        System.out.println(user.getName());

        User user1 = new User(30, "LLL");
        System.out.println(user1.getAge());

        User user2 = new User();
        System.out.println(user2.getName() + user2.getAge());
    }
}