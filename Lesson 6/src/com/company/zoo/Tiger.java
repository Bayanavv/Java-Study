package com.company.zoo;

import com.company.zoo.Cat;

public class Tiger extends Cat {

    //properties:
    int numSpots;

    //constructor:
    public Tiger(boolean isAlive, String lastFeed, int numOfLives, int numSpots) {
        super(isAlive, lastFeed, numOfLives);
        this.numSpots = numSpots;
    }

    @Override
    void print() {
        super.print();
        System.out.println("num Spots: " + numSpots);
    }

    @Override
    public String toString() {
        return super.toString() + "num Spots: " + numSpots;
    }
}
