package com.company;

import com.company.utiles.IO;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person("dudu", "yakov");
        //פניייה למופע
        //הפעולה תלויה בתכונות של האובייקט

        System.out.println(p.toString());
        int anInt = IO.getInt();
    }
}
