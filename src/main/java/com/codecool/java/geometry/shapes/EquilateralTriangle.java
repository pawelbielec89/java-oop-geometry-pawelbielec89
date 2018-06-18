package com.codecool.java.geometry.shapes;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(float a) {
        if (checkIfArgsGreaterThanZero(a)) {
            this.a = a;
        }
        this.name = "Equilateral Triangle";
    }

    public double calculateArea() {
        return super.calculateArea();
    }

    public double calculatePerimeter() {
        return super.calculatePerimeter();
    }

    public String getAreaFormula() {
        return "a<sup>2</sup>xsqrt(3)/4";
    }

    public String getPerimeterFormula() {
        return "ax3";
    }

    public String toString() {
        String side = Float.toString(a);
        return (this.name + ", a = " + side);
    }

    public String getName() {
        return this.name;
    }
}
