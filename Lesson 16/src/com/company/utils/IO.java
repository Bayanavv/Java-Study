package com.company.utils;

import java.util.Scanner;

/**
 * created a new class called IO -> new Java Class... IO
 * Class names Start with Capital Letters!
 */

//final class can't be inherited.
public final class IO{
    /**     The out side Scanner     */
    private static Scanner in = new Scanner(System.in);

    /**     getInt     */
    public static int getInt(String message) {
        boolean isInputValid = false;
        int input = 0;

        while (!isInputValid){
            try{
                System.out.println(message);
                input = in.nextInt();
                isInputValid = true; // the input is valid
            }
            catch(Exception e){
                in.next();//remove the string from the input
                System.out.println("try again");
            }
        }
        return input;
    }

    /**     getString     */
    public static String getString(String message) {
        System.out.println(message);
        return in.next();
    }

    /**     getDouble     */
    public static double getDouble(String message) {
        boolean isInputValid = false;
        double input = 0;

        while (!isInputValid){
            try{
                System.out.println(message);
                input = in.nextDouble();
                isInputValid = true; // the input is valid
            }
            catch(Exception e){
                in.next();//remove the string from the input
                System.out.println("try again");
            }
        }
        return input;
    }

    /**     getBoolean     */
    public static boolean getBoolean(String message) {
        boolean isInputValid = false;
        boolean input = false;

        while (!isInputValid){
            try{
                System.out.println(message);
                input = in.nextBoolean();
                isInputValid = true; // the input is valid
            }
            catch(Exception e){
                in.next();//remove the string from the input
                System.out.println("try again");
            }
        }
        return input;
    }

    /**     getFloat     */
    public static float getFloat(String message) {
        boolean isInputValid = false;
        float input = 0;

        while (!isInputValid){
            try{
                System.out.println(message);
                input = in.nextFloat();
                isInputValid = true; // the input is valid
            }
            catch(Exception e){
                in.next();//remove the string from the input
                System.out.println("try again");
            }
        }
        return input;
    }

    public static int[][] getMultTable() {
        int n = IO.getInt("Table size?");

        int[][] table = new int[n][n];//{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    public static int[] getIntArray() {
        //קלוט מס' שלם - n
        int n = IO.getInt("How many items?");
        //ניצור מערך מגודל n
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = IO.getInt("Enter the next item:");
        }

        return arr;
    }

    public static double getAvg(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " "); //print in one line.

            System.out.printf("%4d", arr[i]);
            //printf -> smarter than print
        }
        //new line()
        System.out.println();
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            IO.print(arr[i]);
        }
    }

    public static int getRandom(int from, int to){
        if(to < from){
            throw new IllegalArgumentException("to must be greater than from");
        }
        double randomDouble = Math.random() * (to - from);
        int randomInt = (int) randomDouble;
        return  randomInt;
    }

}
