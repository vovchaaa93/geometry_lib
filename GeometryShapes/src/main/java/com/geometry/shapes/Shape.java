package com.geometry.shapes;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getInfo() {
        return this.getClass().getSimpleName()
                + " - Area: " + String.format("%.2f", getArea())
                + " - Perimeter: " + String.format("%.2f", getPerimeter());
    }
}
