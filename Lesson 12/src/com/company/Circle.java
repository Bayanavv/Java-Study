package com.company;

import java.util.InputMismatchException;
import java.util.Objects;

public class Circle {
    //Properties:
    private Double radius;

    //constructiopr
    public Circle(Double radius) {
        if(radius < 0){
            throw new InputMismatchException("Radius shilili?, what?");
        }
        this.radius = radius;
    }

    //getter
    public Double getRadius() {
        return radius;
    }

    //setter
    public void setRadius(Double radius) {
        this.radius = radius;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }

    //hackCose
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    //toString
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
