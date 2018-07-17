package com.company.zoo;

public class Dog extends Animal{

    //properties:
    int numOfLegs;

    //constructor:
    public Dog(boolean isAlive, String lastFeed, int numOfLegs) {
        super(isAlive, lastFeed);
        this.numOfLegs = numOfLegs;
    }

    @Override
    void print() {
        super.print();
        System.out.println("num of Legs" + numOfLegs);
    }

    @Override
    public String toString() { return super.toString() + "num of legs" + numOfLegs; }
}
