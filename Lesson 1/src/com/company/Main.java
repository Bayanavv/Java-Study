package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // write your code here
        //JRE = Java runtime environment (היוזר מתקין פעם אחת)
        long aLong;
        aLong = 10L;

        long x = 2389787893242L;
        //JDK = כלי מפתחים שמכילים בתוכם את הכל
        ;//(*כולל JRE)
        //Integers:1, 2, 3 (whole numbers)
        int myNumber = 10;//32bit
        long aLongNumber = 10000000000L;//64bit

        float f = 1.0F;//32bit smaller floating number;
        double y = 10.1;//64bit

        boolean isLoggedIn = false;// = 0;//true;//false;

        //text: String, מחרוזת = char sequence
        String name = "Tomer"; //
        //one character only;
        char aleph = 'א';//תו בודד


        //output: sout
        System.out.println(name);

        System.out.println(x);

        System.out.println(x + y);

        System.out.println(aleph + 1);

        //input:
        //1) OOP:
        //נכתוב בלי להבין כרגע - חובה בשביל קלט
        //שורת חובה בכל תכנית שצריכה קלט

        //Scanner in = new Scanner(System.in);
        //נכתוב תוך שימוש בהשלמה אוטומטית
        Scanner in = new Scanner(System.in);

        //print a message to our user:
        //sout
        System.out.println("Please Enter your name: ");


        //input of a String:
        String userName = in.next();//in.next()-> String;


        System.out.println("Your name is: " + userName);


        //input of an int:
        System.out.println("Enter your age:");
        int userAge = in.nextInt();

    }
}