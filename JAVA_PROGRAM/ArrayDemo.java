public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Correct for loop to iterate over array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("Array Length: " + numbers.length);
    }
}
