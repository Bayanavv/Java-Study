package com.company;

public class Animal {
    //properties:
    boolean isAlive;
    String LastFeed;

    //בנאי
    public Animal(boolean isAlive, String lastFeed) {
        this.isAlive = isAlive;
        LastFeed = lastFeed;
    }
    //פעולות
    void print(){
        System.out.println("Is Alive?" + isAlive);
        System.out.println("Last feed?" + LastFeed);
    }
}
