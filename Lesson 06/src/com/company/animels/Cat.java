package com.company.animels;

import com.company.animels.Animal;

public class Cat extends Animal {


    public Cat(boolean isAlive, String lastFeed) {
        super(isAlive, lastFeed);
    }


    //properties
    int numOfLives;
    int numOfLegs;


    //constructor
    public Cat(boolean isAlive, String lastFeed, int numOfLives, int numOfLegs) {
        super(isAlive, lastFeed);
        this.numOfLives = numOfLives;
        this.numOfLegs = numOfLegs;
    }

    //methods/actions


    @Override
    void print() {
        super.print();
        System.out.println("njm Lives" + numOfLives);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numOfLives=" + numOfLives +
                ", numOfLegs=" + numOfLegs +
                ", isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }
}
