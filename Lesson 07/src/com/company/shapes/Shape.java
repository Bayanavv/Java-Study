package com.company.shapes;

public abstract class Shape {

    //Properties:
    private String color = "Gray";

    //Constructor:
    public Shape(String color) {
        this.color = color;
    }
    public Shape() {
    }

    //Methods:
    public abstract double perimeter();
    public abstract double are();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                "area='" + are() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
