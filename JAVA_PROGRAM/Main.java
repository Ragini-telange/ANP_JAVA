// Base class
class Shape {
    // Method to be overridden
    double area() {
        return 0;
    }
}

// Derived class: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Circle object
        Shape circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());

        // Rectangle object
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
