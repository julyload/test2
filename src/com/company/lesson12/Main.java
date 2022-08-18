package com.company.lesson12;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        Robot robot = new Robot("Pavel", 23, 100);
        Robot robot1 = new Robot("SS", 24, 50);
        if (robot1.fight(robot)) System.out.println("Robot1 win robot");
        else System.out.println("Robot win robot1");
    }
}