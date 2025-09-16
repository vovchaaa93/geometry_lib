package com.geometry.shapes3D;

public abstract class Shape3D {
    public abstract double getVolume();
    public abstract double getSurfaceArea();

    public String getInfo () {
        return this.getClass().getSimpleName()
                + " - Volume: " + String.format("%.2f", getVolume())
                + " - SurfaceArea: " + String.format("%.2f", getSurfaceArea());
    }
}
