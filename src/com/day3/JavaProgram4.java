package com.day3;

public class JavaProgram4 {
    public static void main(String args[]){
        int age = -1;
        if((age >= 0)&&(age <= 12) ){ //0....12
            System.out.println("Child");
        }else if((age >= 13)&&(age <= 17) ){//13 ... 17
            System.out.println("Young adult");
        }else if((age >= 18)&&(age <= 59) ){//18 ... 59
            System.out.println("Adult");
        }else if((age >= 60)&&(age <= 100) ) { //60 ... 100
            System.out.println("Senior");
        }else{
            System.out.println("invalid age!");
        }
        System.out.println("Goodbye!");
    }
}
