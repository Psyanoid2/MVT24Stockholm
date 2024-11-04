package UppgiftOOP.Rektangel;

import java.util.Scanner;

public class Main{

    // Main method to test the class and return values from calculateArea and calculatePerimeter
    public static void main(String[] args) {
        // Create a rectangle object with height 5 and width 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mata in höjden: ");
        int height = scanner.nextInt();
        System.out.println("Mata in bredden: ");
        int width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);

        // Call the methods and return the results
        double area = Rectangle.calculateArea();
        double perimeter = Rectangle.calculatePerimeter();

        // Output the results
        System.out.println("Höjd: " + Rectangle.getHeight());
        System.out.println("Bredd: " + Rectangle.getWidth());
        System.out.println("Area: " + area);
        System.out.println("Omkrets: " + perimeter);

    }
}
