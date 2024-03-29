package com.codecool.java.geometry.shapes;

public class Circle extends Shape {

    public Circle(float a) {
        if (checkIfArgsGreaterThanZero(a)) {
            this.a = a;
        }

        this.name = "Circle";
    }

    public double calculateArea() {
        return Math.PI * a * a;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * a;
    }

    public String getAreaFormula() {
        return "π×r<sup>2</sup>";
    }

    public String getPerimeterFormula() {
        return "2×π×r";
    }

    public String toString() {
        String radius = Float.toString(a);
        return (this.name + ", r = " + radius);
    }

    public String getName() {
        return this.name;
    }
}
