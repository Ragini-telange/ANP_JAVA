
// Calculator class
class Calculator {
    // Method for addition
    int add(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    int subtract(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    int multiply(int a, int b) {
        return a * b;
    }

    // Method for division
    double divide(int a, int b) {
        if (b != 0)
            return (double) a / b;
        else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}

// Main class
public class CalculatorDemo {
    public static void main(String[] args) {
        // Creating object of Calculator
        Calculator calc = new Calculator();

        int a = 20, b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
