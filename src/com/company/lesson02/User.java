package com.company.lesson02;

public class User{
    private int age;
    private String name;
    private String passportData;

    public User(){

    }
    public User(int age, String name, String passportData) {
        this.age = age;
        this.name = name;
        this.passportData = passportData;
    }
    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void talk(String text) {
        System.out.println(text);
    }
}
/*
Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot): реализовать механизм драки роботов в зависимости от силы.
Метод должен определять, выиграл ли робот, у которого вызвали метод fight (this) бой или нет, т.е. возвращать true,
если выиграли и false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false
*/
/*
1) Создать класс Woman с параметрами: name, age. Подумай, какого типа должна быть каждая переменная.
2) Создать классы Cat, Dog, Fish с параметрами: name, age, owner. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы владельцем каждого питомца была одна и та же женщина.
*/
/*
1) Создать класс Woman с параметрами: name, age, husband. Подумай, какого типа должна быть каждая переменная.
2) Создать класс Man с параметрами: name, age, wife. Подумай, какого типа должна быть каждая переменная.
3) В выполняющем методе создать по одному экземпляру каждого класса и сделать так, чтобы объекты стали мужем и женой.
*/