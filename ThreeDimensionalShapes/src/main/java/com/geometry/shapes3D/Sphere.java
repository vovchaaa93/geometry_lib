package com.geometry.shapes3D;

public class Sphere extends Shape3D{
    private final double radius;

    public Sphere (double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
