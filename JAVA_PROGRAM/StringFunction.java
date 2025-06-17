public class StringFunction {
    // Method to reverse a string
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverse(str);
        return str.equals(reversed);
    }

    // Main method to test the functions
    public static void main(String[] args) {
        String testString = "madam"; // Example string

        // Reverse the string and print it
        System.out.println("Original String: " + testString);
        System.out.println("Reversed String: " + reverse(testString));

        // Check if the string is a palindrome
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }
    
}
