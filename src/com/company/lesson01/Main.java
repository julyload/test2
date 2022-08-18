package com.company.lesson01;

public class Main {
    public static void main(String[] args) {
        System.out.println(percent(3));
        print("SSS");
    }

    public static int sum (int a, int b){
        return a+b;
    }
    public static int multy (int a, int b){
        return a*b;
    }
    public static int convert (int euro){
        return euro*2;
    }
    public static double percent (int a){
        return a * 1.1;
    }
    public static void print (String str){
        System.out.print(str);System.out.print(str);System.out.print(str);System.out.print(str);
    }
}

/*
1) Создать метод convert, который должен конвертировать евро в доллары.
В метод должен приходить один аргумент (к-во евро). Метод должен возвращать к-во долларов.
2) Создать метод percent, который принимает один аргумент (число) и возвращает это же число + 10% от него.
3) Создать метод print, который принимает один аргумент (строку) и выводит эту строку 4 раза в консоль.
*/