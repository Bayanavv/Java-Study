package com.company.zoo;

public class Bird extends Animal{

    //properties:
    int numOfWings;


    //constructor:


    public Bird(boolean isAlive, String lastFeed, int numOfWings) {
        super(isAlive, lastFeed);
        this.numOfWings = numOfWings;
    }

    @Override
    void print() {
        super.print();
        System.out.println("num of wings:" + numOfWings);
    }

    @Override
    public String toString() {
        return super.toString() + "num of wings: " + numOfWings;
    }
}
