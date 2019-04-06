package com.company.animels;

import com.company.animels.Animal;

public class Dog extends Animal {

    //Properties
    String howhow;

    //Constructor

    public Dog(boolean isAlive, String lastFeed, String howhow) {
        super(isAlive, lastFeed);
        this.howhow = howhow;
    }


    //Methods/action

    @Override
    void print() {
        super.print();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "howhow='" + howhow + '\'' +
                ", isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }
}
