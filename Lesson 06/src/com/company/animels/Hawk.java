package com.company.animels;

import com.company.animels.Animal;

public class Hawk extends Animal.Bird {

    //Properties

    Boolean IsHunter;

    //Constructor

    public Hawk(boolean isAlive, String lastFeed, String flying, String haveWings, Boolean isHunter) {
        super(isAlive, lastFeed, flying, haveWings);
        IsHunter = isHunter;
    }


    //Methods/action


    @Override
    void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Hawk{" +
                "IsHunter=" + IsHunter +
                ", flying='" + flying + '\'' +
                ", haveWings='" + haveWings + '\'' +
                ", isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }
}
