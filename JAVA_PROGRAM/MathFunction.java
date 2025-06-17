public class MathFunction {
    // Method to calculate the square of a number
    public static int square(int number) {
        return number * number;
    }

    // Method to calculate the cube of a number
    public static int cube(int number) {
        return number * number * number;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        int num = 5; // Example number

        // Calculate and print square and cube
        System.out.println("Square of " + num + " is: " + square(num));
        System.out.println("Cube of " + num + " is: " + cube(num));
    }
    
}
