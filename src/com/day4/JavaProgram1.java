package com.day4;

public class JavaProgram1 {
    public static void main(String args[]){
        //declaring array with initial value
        int[] numbers = {4,6,1,2,8};
        //array size = 5

        //display array values using the index
        System.out.println("numbers are ...");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        //changing value of index 1
        numbers[1] = 25;

        //redisplay array values
        System.out.println("numbers are ...");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
