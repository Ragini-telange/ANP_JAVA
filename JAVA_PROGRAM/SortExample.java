import java.util.Arrays; // Import this to use Arrays functions

public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3};

        // Sorting the array
        Arrays.sort(numbers);

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}