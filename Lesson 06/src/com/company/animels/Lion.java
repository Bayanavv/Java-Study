package com.company.animels;

import com.company.animels.Cat;

public class Lion extends Cat {

    //Properties
    String Bighead;
    boolean theLeader;

    //Constructor

    public Lion(boolean isAlive, String lastFeed, String bighead, boolean theLeader) {
        super(isAlive, lastFeed);
        Bighead = bighead;
        this.theLeader = theLeader;
    }

    public Lion(boolean isAlive, String lastFeed, int numOfLives, int numOfLegs, String bighead, boolean theLeader) {
        super(isAlive, lastFeed, numOfLives, numOfLegs);
        Bighead = bighead;
        this.theLeader = theLeader;
    }

    //Methods/action


    @Override
    void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Lion{" +
                "Bighead='" + Bighead + '\'' +
                ", theLeader=" + theLeader +
                ", numOfLives=" + numOfLives +
                ", numOfLegs=" + numOfLegs +
                ", isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }
}
