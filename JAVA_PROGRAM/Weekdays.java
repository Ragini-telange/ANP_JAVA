public class Weekdays {
    public static void main(String[] args) {

        // 1. Declare and initialize an array of Strings
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                         "Thursday", "Friday", "Saturday"};


        // 2. Print the third day
        System.out.println("The third day of the week is: " + days[2]);


        // 3. Loop through the array and print all days
        System.out.println("\nAll days of the week:");
        for (int i = 0; i < days.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + days[i]);
        }

    }
}
