package com.company.shapes;

public class Rectangle extends Shape{
    //Properties:
    private double width;
    private double height;

    //Constructor:

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle(String color, double width) {
        super(color);
        this.width = width;
    }

    //Methods:


    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double are() {
        return width * height;
    }
}
