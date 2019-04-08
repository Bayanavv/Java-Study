package com.bayanavv;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirrection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirrection = 0;
    }

    public void steer(int direction){
        this.currentDirrection += direction;
        System.out.println("Vehicle.steer():  Steering at " + currentDirrection + "degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirrection = direction;
        System.out.println("Vehicle.move:  Moving at " + currentVelocity + " in direction " + currentDirrection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirrection() {
        return currentDirrection;
    }
}
