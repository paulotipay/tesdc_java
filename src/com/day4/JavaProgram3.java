package com.day4;

import java.util.Scanner;

public class JavaProgram3 {
    public static void main(String args[]) {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        numbers[0] = sc.nextInt();

        System.out.println("Enter number 2");
        numbers[1] = sc.nextInt();

        System.out.println("Enter number 3");
        numbers[2] = sc.nextInt();

        System.out.println("Enter number 4");
        numbers[3] = sc.nextInt();

        System.out.println("Enter number 5");
        numbers[4] = sc.nextInt();

        //display array values using the index
        System.out.println("numbers are ...");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }
}
