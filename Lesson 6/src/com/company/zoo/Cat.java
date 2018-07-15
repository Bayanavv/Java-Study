package com.company.zoo;


import com.company.zoo.Animal;

//animel is the super class
public class Cat extends Animal {

    //properties:
    int numOfLives;


    //constructor:
    public Cat(boolean isAlive, String lastFeed, int numOfLives) {
        super(isAlive, lastFeed);
        this.numOfLives = numOfLives;
    }

    @Override
    void print() {
        super.print();
        System.out.println("num Lives: " + numOfLives);
    }

    @Override
    public String toString() {
        return super.toString() + "num Of Lives: " + numOfLives;
    }
}
