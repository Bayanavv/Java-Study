package com.company.animels;

import com.company.animels.Animal;

public class Raven extends Animal.Bird {

    //Properties
    String BlackColor;
    String LoveToSteal;


    //Constructor

    public Raven(boolean isAlive, String lastFeed, String flying, String haveWings, String blackColor, String loveToSteal) {
        super(isAlive, lastFeed, flying, haveWings);
        BlackColor = blackColor;
        LoveToSteal = loveToSteal;
    }

    //Methods/action


    @Override
    void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Raven{" +
                "BlackColor='" + BlackColor + '\'' +
                ", LoveToSteal='" + LoveToSteal + '\'' +
                ", flying='" + flying + '\'' +
                ", haveWings='" + haveWings + '\'' +
                ", isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }
}
