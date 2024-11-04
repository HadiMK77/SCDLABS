import java.util.Scanner;

public class Rectangle {
    private double length = 1.0;
    private double width = 1.0;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();

        System.out.print("\nEnter the length of the rectangle (between 0.0 and 20.0): ");
        double length = input.nextDouble();
        rectangle.setLength(length);

        System.out.print("Enter the width of the rectangle (between 0.0 and 20.0): ");
        double width = input.nextDouble();
        rectangle.setWidth(width);

        System.out.println("Rectangle Length: " + rectangle.getLength());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
        
        input.close();
    }
}




