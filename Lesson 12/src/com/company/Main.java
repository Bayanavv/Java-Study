package com.company;

import com.company.utils.IO;

public class Main {

    public static void main(String[] args) {

       // int age = IO.getInt("Enter your age:");


        try {
            Circle c = new Circle(-1.1);
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        try {
            //run code:
            //write your code here:

            int howMany = IO.getInt("how many?");
            System.out.println(howMany);
        }
        catch (Exception e) {
            //catch possible exception
            System.out.println("try again...");
        }
        */
    }
}
