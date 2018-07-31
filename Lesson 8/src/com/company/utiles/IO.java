package com.company.utiles;
import java.util.Scanner;

public class IO {
    //getString, getInt, getFloat, getDouble
    public static int getInt(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String getString(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    public static double getDouble(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }

    public static boolean getBoolean(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextBoolean();
    }

    public static float getFloat(String message) {
        System.out.println(message);
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
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

    //print arr
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


}
