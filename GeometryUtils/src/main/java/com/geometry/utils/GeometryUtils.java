package com.geometry.utils;

import com.geometry.shapes.*;

public class GeometryUtils {

    public static double cmToMeters(double cm) {
        return cm / 100;
    }

    public static boolean compareAreas(Shape c1, Shape c2) {
        return Math.abs(c1.getArea() - c2.getArea()) < 0.001;
    }

    public static String getLargestShape(Shape rect, Shape tri) {
        return rect.getArea() > tri.getArea() ? "Rectangle" : "Triangle";
    }
}