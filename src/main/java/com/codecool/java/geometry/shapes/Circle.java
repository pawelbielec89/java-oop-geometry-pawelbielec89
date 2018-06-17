package com.codecool.java.geometry.shapes;

public class Circle extends Shape {
    float r;
    String name;

    public Circle(float r) {
        if (checkIfArgsGreaterThanZero(r)) {
            this.r = r;
        }

        this.name = "Circle";
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    public String getAreaFormula() {
        return "π×r<sup>2</sup>";
    }

    public String getPerimeterFormula() {
        return "2×π×r";
    }

    public String toString() {
        String radius = Float.toString(r);
        return (this.name + ", r = " + radius);
    }

    public String getName() {
        return this.name;
    }
}
