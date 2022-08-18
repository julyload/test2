package com.company.lesson12;

public class Robot {
    private String name;
    private int age;
    private int power;

    public Robot (String name, int age, int power){
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public boolean fight(Robot anotherRobot){
        if (anotherRobot.power < this.power) return true;
        else return false;
    }
}
