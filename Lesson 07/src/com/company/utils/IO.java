package com.company.utils;

import java.util.Scanner;

public class IO {
    private static Scanner in = new Scanner(System.in);
    public static String getString(String message){
        System.out.println(message);
        return in.next();
    }
    public static int getInt(String message){
        System.out.println(message);
        return in.nextInt();
    }
    public static Double getDouble(String message){
        System.out.println(message);
        return in.nextDouble();
    }
    public static Float getFloat(String message){
        System.out.println(message);
        return in.nextFloat();
    }
    public static Boolean getBoolean(String message){
        System.out.println(message);
        return in.nextBoolean();
    }
    public static int[] getIntArray(){
        int n = IO.getInt("hoe many items: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = IO.getInt("enter the next item: ");
        }
        return arr;
    }
    public static int[][] getMulTable(){
        int n = IO.getInt("table size: ");
        int[][] table = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
    public static Double getAvg(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        System.out.println();
    }
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            IO.print(arr[i]);
        }
    }
}
