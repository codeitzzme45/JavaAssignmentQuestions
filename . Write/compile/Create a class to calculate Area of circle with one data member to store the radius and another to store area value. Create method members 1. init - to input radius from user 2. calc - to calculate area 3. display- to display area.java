//Create a class to calculate Area of circle with one data member to store the radius and
another to store area value.
Create method members
1. init - to input radius from user
2. calc - to calculate area
3. display- to display area
//

import java.util.Scanner;

class Circle {
    private double radius;
    private double area;

    // Method to initialize radius
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }

    // Method to calculate area
    public void calc() {
        area = Math.PI * radius * radius;
    }

    // Method to display area
    public void display() {
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.init();   // Initialize the radius
        circle.calc();   // Calculate the area
        circle.display(); // Display the area
    }
}
