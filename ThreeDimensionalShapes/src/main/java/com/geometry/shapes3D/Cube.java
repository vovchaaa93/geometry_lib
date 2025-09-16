package com.geometry.shapes3D;

public class Cube extends Shape3D{
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * side * side;
    }
}