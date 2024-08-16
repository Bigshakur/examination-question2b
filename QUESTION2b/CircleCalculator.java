/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.number2;

import java.util.Scanner;

/**
 *
 * @author Shakur
 */
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // we are prompting the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // here we are  creating the Circle object
        Circle circle = new Circle(radius);

        // the methods bellow enable us to calculate the area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        // after all we can now display the results
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);

        // after every thing, we scan now close the scanner
        scanner.close();
    }
}

