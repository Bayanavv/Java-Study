package com.company;

import com.company.birds.Flyable;

public class Bird  extends Animel implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("tweet");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }

    @Override
    public void waveWings() {
        System.out.println("waving it");
    }
}
