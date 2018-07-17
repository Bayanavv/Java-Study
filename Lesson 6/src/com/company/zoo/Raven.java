package com.company.zoo;

public class Raven extends Bird{

    //properties:
    boolean steal;
    //constructor:


    public Raven(boolean isAlive, String lastFeed, int numOfWings, boolean steal) {
        super(isAlive, lastFeed, numOfWings);
        this.steal = steal;
    }

    @Override
    void print() {
        super.print();
        System.out.println("douse he seal? T or F" + steal);

    }

    @Override
    public String toString() { return super.toString() + "dose he steal? r or f" + steal; }
}
