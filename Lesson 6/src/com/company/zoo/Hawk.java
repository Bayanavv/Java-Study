package com.company.zoo;

public class Hawk extends Bird{

    //properties:
    boolean isHunter;

    //constructor:

    public Hawk(boolean isAlive, String lastFeed, int numOfWings, boolean isHunter) {
        super(isAlive, lastFeed, numOfWings);
        this.isHunter = isHunter;
    }

    @Override
    void print() {
        super.print();
        System.out.println("is hunter" + isHunter);
    }

    @Override
    public String toString() {
        return super.toString() + "is hunter" + isHunter;
    }
}
