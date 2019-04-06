package com.company.animels;

import com.company.animels.Cat;

public class Tiger extends Cat {

    //Properties
    int numOfSpots;

    //Constructor



    public Tiger(boolean isAlive, String lastFeed, int numOfLives, int numOfLegs, int numOfSpots) {
        super(isAlive, lastFeed, numOfLives, numOfLegs);
        this.numOfSpots = numOfSpots;
    }


    //Methods/action


    @Override
    void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "numOfSpots=" + numOfSpots +
                ", numOfLives=" + numOfLives +
                ", numOfLegs=" + numOfLegs +
                ", isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }
}
