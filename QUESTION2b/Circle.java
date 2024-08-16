/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.number2;

/**
 *
 * @author Shakur
 */

import java.util.Scanner;

class Circle {
    private double radius;
    private final double PI = 22.0 / 7.0; // Using 22/7 for π

    // here wec are now initializing the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // now this is the method for calculating the area
    public double calculateArea() {
        return PI * radius * radius;
    }

    // this method finds  the circumference
    public double calculateCircumference() {
        return 2 * PI * radius;
    }
}

