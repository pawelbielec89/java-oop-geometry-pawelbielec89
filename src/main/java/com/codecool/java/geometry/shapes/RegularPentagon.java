package com.codecool.java.geometry.shapes;

public class RegularPentagon extends Shape {
    float a;
    String name;

    public RegularPentagon(float a) {
        if (checkIfArgsGreaterThanZero(a)) {
            this.a = a;
        }
        this.name = "RegularPentagon";
    }

    public double calculateArea() {
        double result = (Math.sqrt(25 + 10 * Math.sqrt(5))) / 4 * a * a;
        return result;
    }

    public double calculatePerimeter() {
        double result = (double) a + a + a + a + a;
        return result;
    }

    public String getAreaFormula() {
        return "(a<sup>2</sup> sqrt(5(5+2sqrt(5))))/4";
    }


    public String getPerimeterFormula() {
        return "Perimeter = 5a";
    }

    public String toString() {
        String sideA = Float.toString(a);
        return (this.name + ", a = " + sideA);
    }

    public String getName() {
        return this.name;
    }
}
