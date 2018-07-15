package com.company;

public class Tiger extends Cat {
    int numSpots;

    public Tiger(boolean isAlive, String lastFeed, int numOfLives, int numSpots) {
        super(isAlive, lastFeed, numOfLives);
        this.numSpots = numSpots;
    }
}
