package com.company;


//animel is the super class
public class Cat extends Animal{
    int numOfLives;


    //constructor:
    public Cat(boolean isAlive, String lastFeed, int numOfLives) {
        super(isAlive, lastFeed);
        this.numOfLives = numOfLives;
    }
}
