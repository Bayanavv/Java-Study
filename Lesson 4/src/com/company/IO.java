package com.company;

//קיצור שם
//Input Out Put


import java.util.Scanner;

public class IO {

    public static void myFunc(){

        System.out.println("hello, aloha, shalom, nihau");
    }
    public static void targil(){

        System.out.println("targil");
    }

    static void getAge(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = in.nextInt();

    }


}
