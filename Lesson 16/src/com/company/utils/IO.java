package com.company.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * created a new class called IO -> new Java Class... IO
 * Class names Start with Capital Letters!
 */

//final class can't be inherited.
public final class IO{

        //scanner
        private static Scanner in = new Scanner(System.in);


        public static int getPositiveInt(String message) {
            return IO.getInt(message, 0, Integer.MAX_VALUE);
        }

        public static int getInt(String message, int from, int to) {
            int result = IO.getInt(message);

            //while(notInRange){ input again}
            while (result < from || result > to) {
                System.out.println("Must be in range: " + from + " - " + to + ":");
                result = IO.getInt(message);
            }

            return result;
        }

        //getString, getInt, getFloat, getDouble
        public static int getInt(String message) {
            boolean isInputValid = false;
            int input = 0;

            while (!isInputValid) {
                try { //ctrl+alt+t
                    System.out.println(message);
                    input = in.nextInt();
                    isInputValid = true; //the input is valid
                } catch (Exception e) {
                    in.next();//remove the string from the input
                    System.out.println("try again");
                }
            }
            return input;
        }

        public static String getString(String message) {
            System.out.println(message);
            Scanner in = new Scanner(System.in);
            return in.next();
        }

        public static double getDouble(String message) {
            boolean isInputValid = false;
            double input = 0;

            while (!isInputValid) {
                try { //ctrl+alt+t
                    System.out.println(message);
                    input = in.nextDouble();
                    isInputValid = true; //the input is valid
                } catch (Exception e) {
                    in.next();//remove the string from the input
                    System.out.println("try again");
                }
            }
            return input;
        }

        public static boolean getBoolean(String message) {
            boolean isInputValid = false;
            boolean input = false;

            while (!isInputValid) {
                try { //ctrl+alt+t
                    System.out.println(message);
                    input = in.nextBoolean();
                    isInputValid = true; //the input is valid
                } catch (Exception e) {
                    in.next();//remove the string from the input
                    System.out.println("try again: true or false");
                }
            }
            return input;
        }

        public static float getFloat(String message) {
            boolean isInputValid = false;
            float input = 0;

            while (!isInputValid) {
                try { //ctrl+alt+t
                    System.out.println(message);
                    input = in.nextFloat();
                    isInputValid = true; //the input is valid
                } catch (Exception e) {
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

        //API, code for other programs
        public static boolean createFile(String fileName) throws IOException {
            //1) instance of a java class
            File f = new File(fileName);
            //2)create a file!
            return f.createNewFile();
            //System.out.println("Please contact your admin");
        }

        public static void write(String fileName, String data) throws IOException {
            //1) instance of a java class
            File f = new File(fileName);

            Path path = f.toPath();//java.io->java.nio

            Files.write(path, data.getBytes());
        }

        public static String read(String fileName) throws IOException {
            //1) instance of a java class
            File f = new File(fileName);

            Path path = f.toPath();//java.io->java.nio

            byte[] bytes = Files.readAllBytes(path);//nio

            String result = new String(bytes);

            return result;
        }

        public static boolean deleteFile(String fileName) {
            //1) instance of a java class
            File f = new File(fileName);
            return f.delete();
        }

        public static boolean createDir(String dirName) {
            //1) instance of a java class  - describes a path
            File f = new File(dirName);

            //new Directory
            return f.mkdir();
        }

        public static int getRandom(int to) {
            double randomDouble = Math.random() * (to + 1);
            return (int) randomDouble;
        }


        public static int getRandom(int from, int to) {
            if (to < from) {
                throw new IllegalArgumentException("to must be greater than from");
            }
            double randomDouble = from + Math.random() * (to - from + 1);
            return (int) randomDouble;
        }
//
//    public static boolean createFile3(String fileName) throws IOException {
//        File f = new File(fileName);
//        try {
//            f.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("Bad Bad");
//        }
//        //System.out.println("Please contact your admin");
//    }

/*
    public static boolean createFile2(String fileName) {
        File f = new File(fileName);
        try {
            return f.createNewFile();
        } catch (IOException e) {
            System.out.println("Please contact your system administrator");
            return false;
        }
    }*/


}




