package com.company.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        closeToFive(a, b);
    }

    public static void max(BufferedReader reader) throws IOException {
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > b) System.out.println(a);
        else if(a<b) System.out.println(b);
        else System.out.println("Равны");
    }

    public static void closeToFive (int a, int b) {
        int raznicaA = Math.abs(5 - a);
        int raznicaB = Math.abs(5 - b);
        if (raznicaA == 0) System.out.println(a);
        else if (raznicaB == 0) System.out.println(b);
        else if (raznicaB > raznicaA) System.out.println(a);
        else if (raznicaB < raznicaA) System.out.println(b);
        else System.out.println(a);
    }
}