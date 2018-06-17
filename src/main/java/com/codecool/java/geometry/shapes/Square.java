package com.codecool.java.geometry.shapes;

public class Square extends Rectangle {
    float a;
    String name;

    public Square(float a) {
        if (checkIfArgsGreaterThanZero(a)) {
            this.a = a;
        }
        this.name = "Square";
    }

    public double calculateArea() {
        double result = (double) a * a;
        return result;
    }

    public double calculatePerimeter() {
        double result = (double) a * 4;
        return result;
    }

    public String getAreaFormula() {
        return "Area = a×a";
    }

    public String getPerimeterFormula() {
        return "Perimeter = 4a";
    }

    public String toString() {
        String side = Float.toString(a);
        return (this.name + ", a = " + side);
    }

    public String getName() {
        return this.name;
    }
}
