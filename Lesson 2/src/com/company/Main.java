package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //מאפשר לנו לקלוט ערכים מהמהשתמש
        //נכתוב פעם אחת בלבד בכל תוכנית חדשה
        Scanner in = new Scanner(System.in);
//        //sout -> use auto completion (sout->Enter)
//        //print a message to the console.
//        System.out.println("Enter Your Name:");
//        //נכריז על משתנה מסוג String
//        String name = in.next();//השמה מהScanner לתוך המשתנה
//
//        //input the email (String):
//        System.out.println("Enter your Email:");
//        String email = in.next();
//
//        //input the age (int):
//        System.out.println("Enter Your Age:");
//        int age = in.nextInt();
//
//        //output the result (Summary)
//        //print //sout
//        System.out.println("Your Name is: " + name);
//        System.out.println("Your Age is: " + age);//ctrl + d
//        System.out.println("Your Email is: " + email);//ctrl + d
//
//
//        System.out.println("Enter the first Number: ");
//        int num1 = in.nextInt();
//
//        System.out.println("Enter the 2nd Number: ");
//        int num2 = in.nextInt();
//
//        System.out.println("Enter the 2nd Number: ");
//        int num3 = in.nextInt();

//        System.out.println(num1 * num2 + " = " + num1 + " * " + num2);
//        System.out.println(num1 / num2 + " = " + num1 + " / " + num2);
//        System.out.println(num1 + num2 + " = " + num1 + " + " + num2);
//        System.out.println(num1 - num2 + " = " + num1 + " - " + num2);
//        System.out.println(num1 % num2 + " = " + num1 + " % " + num2);


        //The Avarage:
        //(2 + 3 + 4 ) / 3
        //(10 + 10 + 11 )/ 3 = 10
//        double avg = (num1 + num2 + num3) / 3;
//        System.out.println("The Avarage is: " + avg);


//        int time = 267;
//        int hours = time / 60;
//        int minutes = time % 60; //modulu
//
//        System.out.println("Hours: " + hours);
//        System.out.println("Minutes: " + minutes);


//        int num = 658;
//        int left = num / 100;//658 / 100
//
//        System.out.println(left);
//
//
//        int right = num % 100; //58
//
//        int tens = right / 10; //5
//
//        int ones = right % 10;//8

//
//        System.out.println("Enter x: ");
//        int x = in.nextInt();
//
//        System.out.println("Enter y: ");
//        int y = in.nextInt();
//
//
//        //x++;//unary operator
//
//        if (/*תנאי*/ x == y) {
//            System.out.println("x == y");
//        } else if (x > y) {
//            System.out.println("x > y");
//        }


        System.out.println("Enter your grade:");
        int grade = in.nextInt();

        //91 - 100
//        if(grade > 90 && grade <= 100){
//
//        }


        if (grade > 100 || grade < 0) {
            System.out.println("Error - Not in range: ");
        }else if(/*grade is in range*/ grade > 90){
            //90 - 100
            System.out.println("מצוין");
        }
        else if(/*grade is in range*/ grade > 80){
            //90 - 100
            System.out.println("טוב");
        }
    }
}