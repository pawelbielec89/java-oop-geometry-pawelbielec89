package com.codecool.java.geometry.shapes;


public class Triangle extends Shape {
    public float a;
    public float b;
    public float c;
    public String name;

    public Triangle(float a, float b, float c) {
        if (checkIfArgsGreaterThanZero(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        this.name = "Triangle";
    }

    public Triangle() {
    }

    public double calculateArea() {
        float s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        double result = area;
        return result;
    }

    public double calculatePerimeter() {
        double result = (double) a + b + c;
        return result;
    }

    public String getAreaFormula() {
        return "Area = sqrt(s(s-a)(s-b)(s-c)), ";
    }

    public String getPerimeterFormula() {
        return "Perimeter = a + b + c";
    }

    public String toString() {
        String sideA = Float.toString(a);
        String sideB = Float.toString(b);
        String sideC = Float.toString(c);
        return (this.name + ", a = " + sideA + ", b = " + sideB + ", c = " + sideC);
    }

    public String getName() {
        return this.name;
    }
}

