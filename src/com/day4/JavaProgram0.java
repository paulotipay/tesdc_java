package com.day4;

import java.util.Scanner;

public class JavaProgram0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = sc.nextInt();

        System.out.println("Enter number 2");
        int number2 = sc.nextInt();

        System.out.println("Enter number 3");
        int number3 = sc.nextInt();

        System.out.println("Enter number 4");
        int number4 = sc.nextInt();

        System.out.println("Enter number 5");
        int number5 = sc.nextInt();

        //compute average
        int average = number1 + number2 + number3 + number4 + number5;

        System.out.println("The sum is "+average);

    }
}
