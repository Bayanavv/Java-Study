package com.company.zoo;

public class Lion extends Cat{

    //properties:
    String huntTime;


    //constructor:


    public Lion(boolean isAlive, String lastFeed, int numOfLives, String huntTime) {
        super(isAlive, lastFeed, numOfLives);
        this.huntTime = huntTime;
    }

    @Override
    void print() {
        super.print();
        System.out.println("hunt time :?" + huntTime);
    }

    @Override
    public String toString() {
        return super.toString() + "hunt time :?" + huntTime;
    }
}
