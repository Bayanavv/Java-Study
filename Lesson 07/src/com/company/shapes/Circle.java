package com.company.shapes;

public class Circle extends Shape{

    //Properties:
    private Double radius;
    public static final Double pi = 3.14;


    //Constructor:
    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi *radius;
    }
    @Override
    public double are() {
        return pi * radius *radius;
    }


    //Methods:


}
