package com.bayanavv;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gears;
    private boolean isMenual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isMenual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isMenual = isMenual;
        this.currentGear = 1;
    }


}
