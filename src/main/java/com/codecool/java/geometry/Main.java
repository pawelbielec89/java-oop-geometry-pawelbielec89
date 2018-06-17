package com.codecool.java.geometry;

import com.codecool.java.geometry.containers.ShapeList;
import com.codecool.java.geometry.shapes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShapeList shapes = new ShapeList();
        boolean isRunning = true;
        Scanner in = new Scanner(System.in);
        String answer = "";
        while (isRunning) {
            System.out.println(
                    "Learn Geometry.\n"
                            + "  What do you want to do?\n"
                            + "  (1) Add new shape\n"
                            + "  (2) Show all shapes\n"
                            + "  (3) Show shape with the largest perimeter\n"
                            + "  (4) Show shape with the largest area\n"
                            + "  (5) Show formulas\n"
                            + "  (0) Exit program");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.println(
                            "Choose shape: Circle, Rectangle, Square, RegularPentagon, Triangle, EquilateralTriangle");
                    Scanner input = new Scanner(System.in);
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase("circle") && !shapes.contains(answer)) {
                        System.out.println("Provide radius: ");
                        float radius = Float.parseFloat(input.nextLine());
                        Circle circle = new Circle(radius);
                        shapes.addShape(circle);
                    } else if ((answer.equalsIgnoreCase("rectangle") && !shapes.contains(answer))) {
                        System.out.println("Provide side A: ");
                        float sideA = Float.parseFloat(input.nextLine());
                        System.out.println("Provide side B: ");
                        float sideB = Float.parseFloat(input.nextLine());
                        Rectangle rectangle = new Rectangle(sideA, sideB);
                        shapes.addShape(rectangle);
                    } else if ((answer.equalsIgnoreCase("square") && !shapes.contains(answer))) {
                        System.out.println("Provide side A: ");
                        float side = Float.parseFloat(input.nextLine());
                        Square square = new Square(side);
                        shapes.addShape(square);
                    } else if ((answer.equalsIgnoreCase("regularpentagon") && !shapes.contains(answer))) {
                        System.out.println("Provide side A: ");
                        float side = Float.parseFloat(input.nextLine());
                        RegularPentagon regularpentagon = new RegularPentagon(side);
                        shapes.addShape(regularpentagon);
                    } else if ((answer.equalsIgnoreCase("triangle") && !shapes.contains(answer))) {
                        System.out.println("Provide side A: ");
                        float sideA = Float.parseFloat(input.nextLine());
                        System.out.println("Provide side B: ");
                        float sideB = Float.parseFloat(input.nextLine());
                        System.out.println("Provide side C: ");
                        float sideC = Float.parseFloat(input.nextLine());
                        Triangle triangle = new Triangle(sideA, sideB, sideC);
                        shapes.addShape(triangle);
                    } else if ((answer.equalsIgnoreCase("equilateraltriangle") && !shapes.contains(answer))) {
                        System.out.println("Provide side A: ");
                        float side = Float.parseFloat(input.nextLine());
                        EquilateralTriangle equilateraltriangle = new EquilateralTriangle(side);
                        shapes.addShape(equilateraltriangle);
                    }

                    break;
                case 2:
                    shapes.getShapesTable();
                    break;
                case 3:
                    shapes.getLargestPerimeter();
                    break;
                case 4:
                    shapes.getLargestArea();
                    break;
                case 5:
                    System.out.println("Which shape would you like to check? :\n");
                    for (int i = 0; i < shapes.getList().size(); i++) {
                        System.out.println(shapes.getList().get(i).getName());
                    }
                    Scanner scanner = new Scanner(System.in);
                    answer = scanner.nextLine();
                    if (shapes.contains(answer)) {
                        for (int i = 0; i < shapes.getList().size(); i++) {
                            if (shapes.getList().get(i).getName().equalsIgnoreCase(answer)) {
                                System.out.println("Area :" + shapes.getList().get(i).getAreaFormula());
                                System.out.println("Perimeter :" + shapes.getList().get(i).getPerimeterFormula());
                            }
                        }
                    } else {
                        System.out.println("There is no such shape!");}
                        break;
                        case 0:
                            isRunning = false;
                            break;
                    }
            }
        }
    }
