package com.company;

import java.util.Scanner;

public class Car implements Driveable{

    //properties.
    private String model;
    private int year = 2018;

    //constructor(this is a empty constructor, if we dont build any constructor i get a default empty constructor)
    public Car() {
    }

    //constructor for both model and year.
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    //constructor for model only.
    public Car(String model) {
        this.model = model;
    }

    //constructor for year only.
    public Car(int year) {
        this.year = year;
    }

    //getter and setter.
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //toString

    @Override
    public String  toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("ving ving");
    }

    @Override
    public int turnweel() {
        System.out.println("how match degees?");
        Scanner in = new Scanner(System.in);
        return in.nextInt();


    }
}
