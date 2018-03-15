package com.codecool.java.geometry.shapes;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {
    /**
     * Calculates shape's area.
     * @return area of the shape
     */
    public float getArea() {
        throw new NotImplementedException();
    }

    /**
     * Calculates shape's perimeter.
     * @return perimeter of the shape
     */
    public float getPerimeter() {
        throw new NotImplementedException();
    }

    /**
     * Returns information about the shape as string.
     * @return information bout shape
     */
    public String toString() {
        throw new NotImplementedException();
    }

    /**
     * Check if any of args are not below 0.
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     * @param args
     * @return true if any of args are not below 0
     */
    public static boolean checkIfArgsNotBelowZero(float... args) {
        throw new NotImplementedException();
    }

    /**
     * Returns formula for the area of the shape as a string.
     * @return area formula
     */
    public static  String getAreaFormula() {
        throw new NotImplementedException();
    }

    /**
     * Returns formula for the perimeter of the shape as a string.
     * @return perimeter formula
     */
    public static String getPerimeterFormula() {
        throw new NotImplementedException();
    }
}
