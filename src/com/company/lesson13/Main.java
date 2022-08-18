package com.company.lesson13;

import com.company.lesson12.Robot;

import javax.naming.PartialResultException;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        int []array = new int []{1,3,4,5,2,3};
        array[0] = 9;
        System.out.println(array[1]);
        for (int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
        int [][]array1 = new int [1][2];
        Arrays.sort(array);
    }
}