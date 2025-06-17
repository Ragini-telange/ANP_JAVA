public class StudentMarks {

    public static void main(String[] args) {
        // 1. Declaration and Initialization
        int[] marks = {85, 92, 76, 88, 95};

        // 2. Accessing and Modifying elements
        System.out.println("Original marks of student 3: " + marks[2]);
        marks[2] = 80; // Changing mark of student 3
        System.out.println("Updated marks of student 3: " + marks[2]);

        // 3. Displaying all marks using loop
        System.out.println("\nAll student marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // 4. Finding Average, Maximum and Minimum marks
        int sum = 0, max = marks[0], min = marks[0];

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if (marks[i] > max) max = marks[i];
            if (marks[i] < min) min = marks[i];
        }

        double average = (double) sum / marks.length;

        // 5. Final output
        System.out.println("\nTotal Students: " + marks.length);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
