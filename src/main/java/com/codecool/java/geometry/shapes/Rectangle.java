package com.codecool.java.geometry.shapes;

public class Rectangle extends Shape {
    float a;
    float b;
    String name;

    public Rectangle(float a, float b) {
        if (checkIfArgsGreaterThanZero(a, b)) {
            this.a = a;
            this.b = b;
        }
        this.name = "Rectangle";
    }

    public Rectangle() {
    }

    public double calculateArea() {
        double result = (double) a * b;
        return result;
    }

    public double calculatePerimeter() {
        double result = (double) a + a + b + b;
        return result;
    }

    public String getAreaFormula() {
        return "Area = a×b";
    }

    public String getPerimeterFormula() {
        return "Perimeter = 2a + 2b";
    }

    public String toString() {
        String sideA = Float.toString(a);
        String sideB = Float.toString(b);
        return (this.name + ", a = " + sideA + ", b = " + sideB);
    }

    public String getName() {
        return this.name;
    }
}
