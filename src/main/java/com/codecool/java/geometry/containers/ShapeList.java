package com.codecool.java.geometry.containers;

import java.util.ArrayList;
import com.codecool.java.geometry.shapes.*;
import java.util.List;

public class ShapeList {
    List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape s) {
        shapeList.add(s);
    }

    public boolean contains(String str) {
        for (int i = 0; i < shapeList.size(); i++) {
            if (shapeList.get(i).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void getShapesTable() {
        for (int i = 0; i < shapeList.size(); i++) {
            System.out.println(shapeList.get(i).getName());
        }
    }

    public void getLargestPerimeter() {
        int index = 0;
        double maxPerimeter = 0;
        for (int i = 0; i < shapeList.size(); i++) {
            double perimeter = shapeList.get(i).calculatePerimeter();
            if (perimeter > maxPerimeter) {
                maxPerimeter = perimeter;
                index = i;
            }
        }
        System.out.println(shapeList.get(index).toString() + ", Perimeter: " + maxPerimeter);
    }

    public void getLargestArea() {
        int index = 0;
        double maxArea = 0;
        for (int i = 0; i < shapeList.size(); i++) {
            double area = shapeList.get(i).calculateArea();
            if (area > maxArea) {
                maxArea = area;
                index = i;
            }
        }
        System.out.println(shapeList.get(index).toString() + ", Area: " + maxArea);
    }
    public List<Shape> getList() {
        return this.shapeList;
    }
}
