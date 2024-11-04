package UppgiftOOP.Rektangel;

public class Rectangle {
    // Attributes: height and width of the rectangle
    static int height;
    static int width;

    // Constructor to initialize the height and width
    public Rectangle(int length, int width) {
        this.height = width;
        this.width = length;
    }

    // Method to calculate the area of the rectangle
    public static int calculateArea() {
        return height * width;
    }

    // Method to calculate the perimeter of the rectangle
    public static int calculatePerimeter() {
        return 2 * (height + width);
    }

    // Getter for height
    public static int getHeight() {
        return height;
    }

    // Getter for width
    public static int getWidth() {
        return width;
    }

}
