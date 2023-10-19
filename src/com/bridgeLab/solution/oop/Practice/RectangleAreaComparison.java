package com.bridgeLab.solution.oop.Practice;

import java.util.Scanner;

public class RectangleAreaComparison {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.println("Enter dimensions for Rectangle 1:");
        System.out.print("Length: ");
        double length1 = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth1 = scanner.nextDouble();
        rectangle1.setDim(length1, breadth1);

        System.out.println("Enter dimensions for Rectangle 2:");
        System.out.print("Length: ");
        double length2 = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth2 = scanner.nextDouble();
        rectangle2.setDim(length2, breadth2);

        double area1 = rectangle1.getArea();
        double area2 = rectangle2.getArea();

        System.out.println("Area of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);

        if (area1 > area2) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (area2 > area1) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }

        scanner.close();
    }

}
