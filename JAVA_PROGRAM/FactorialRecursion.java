public class FactorialRecursion {

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        int number = 6; // Number to calculate factorial
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
